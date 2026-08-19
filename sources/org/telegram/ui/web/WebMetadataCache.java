package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;

public class WebMetadataCache {
    private static WebMetadataCache instance;
    private HashMap cache;
    private boolean loaded;
    private boolean loading;
    private boolean saving;

    public static WebMetadataCache getInstance() {
        if (instance == null) {
            instance = new WebMetadataCache();
        }
        return instance;
    }

    public static class WebMetadata extends TLObject {
        public int actionBarColor;
        public int backgroundColor;
        public String domain;
        public Bitmap favicon;
        public byte[] faviconBytes;
        public String sitename;
        public long time = System.currentTimeMillis();
        public String title;

        public static WebMetadata from(BotWebViewContainer.MyWebView myWebView) {
            WebMetadata webMetadata = new WebMetadata();
            String hostAuthority = AndroidUtilities.getHostAuthority(myWebView.getUrl(), true);
            webMetadata.domain = hostAuthority;
            if (TextUtils.isEmpty(hostAuthority)) {
                return null;
            }
            if (myWebView.lastTitleGot) {
                webMetadata.title = myWebView.lastTitle;
            }
            webMetadata.sitename = myWebView.lastSiteName;
            if (myWebView.lastActionBarColorGot) {
                webMetadata.actionBarColor = myWebView.lastActionBarColor;
            }
            if (myWebView.lastBackgroundColorGot) {
                webMetadata.backgroundColor = myWebView.lastBackgroundColor;
            }
            if (myWebView.lastFaviconGot) {
                webMetadata.favicon = myWebView.lastFavicon;
            }
            return webMetadata;
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt64(this.time);
            String str = this.domain;
            if (str == null) {
                str = "";
            }
            outputSerializedData.writeString(str);
            String str2 = this.title;
            if (str2 == null) {
                str2 = "";
            }
            outputSerializedData.writeString(str2);
            String str3 = this.sitename;
            outputSerializedData.writeString(str3 != null ? str3 : "");
            outputSerializedData.writeInt32(this.actionBarColor);
            outputSerializedData.writeInt32(this.backgroundColor);
            if (this.favicon == null) {
                outputSerializedData.writeInt32(1450380236);
                return;
            }
            outputSerializedData.writeInt32(953850003);
            byte[] bArr = this.faviconBytes;
            if (bArr != null) {
                outputSerializedData.writeByteArray(bArr);
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (Build.VERSION.SDK_INT >= 30) {
                this.favicon.compress(Bitmap.CompressFormat.WEBP_LOSSY, 80, byteArrayOutputStream);
            } else {
                this.favicon.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.faviconBytes = byteArray;
            outputSerializedData.writeByteArray(byteArray);
            try {
                byteArrayOutputStream.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.time = inputSerializedData.readInt64(z);
            this.domain = inputSerializedData.readString(z);
            this.title = inputSerializedData.readString(z);
            this.sitename = inputSerializedData.readString(z);
            this.actionBarColor = inputSerializedData.readInt32(z);
            this.backgroundColor = inputSerializedData.readInt32(z);
            if (inputSerializedData.readInt32(z) == 1450380236) {
                this.favicon = null;
            } else {
                this.faviconBytes = inputSerializedData.readByteArray(z);
                this.favicon = BitmapFactory.decodeStream(new ByteArrayInputStream(this.faviconBytes));
            }
        }
    }

    static final class MetadataFile extends TLObject {
        public final ArrayList array;

        private MetadataFile() {
            this.array = new ArrayList();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(this.array.size());
            for (int i = 0; i < this.array.size(); i++) {
                ((WebMetadata) this.array.get(i)).serializeToStream(outputSerializedData);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            for (int i = 0; i < int32; i++) {
                WebMetadata webMetadata = new WebMetadata();
                webMetadata.readParams(inputSerializedData, z);
                if (TextUtils.isEmpty(webMetadata.domain)) {
                    return;
                }
                this.array.add(webMetadata);
            }
        }
    }

    public File getCacheFile() {
        return new File(FileLoader.getDirectory(4), "webmetacache.dat");
    }

    public WebMetadata get(String str) {
        load();
        WebMetadata webMetadata = (WebMetadata) this.cache.get(str);
        if (webMetadata == null) {
            return null;
        }
        webMetadata.time = Math.max(webMetadata.time, System.currentTimeMillis());
        scheduleSave();
        return webMetadata;
    }

    public void save(WebMetadata webMetadata) {
        if (webMetadata == null) {
            return;
        }
        if (this.cache == null) {
            this.cache = new HashMap();
        }
        if (TextUtils.isEmpty(webMetadata.domain)) {
            return;
        }
        this.cache.put(webMetadata.domain, webMetadata);
        load();
        scheduleSave();
    }

    public void load() {
        if (this.loaded || this.loading) {
            return;
        }
        this.loading = true;
        if (this.cache == null) {
            this.cache = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                WebMetadataCache.$r8$lambda$GPcF8HnHTI7svLi0lIMiiPOg2Vw(this.f$0);
            }
        });
    }

    public static void $r8$lambda$GPcF8HnHTI7svLi0lIMiiPOg2Vw(final WebMetadataCache webMetadataCache) {
        File cacheFile = webMetadataCache.getCacheFile();
        if (!cacheFile.exists()) {
            webMetadataCache.loaded = true;
            return;
        }
        final ArrayList arrayList = new ArrayList();
        try {
            SerializedData serializedData = new SerializedData(cacheFile);
            MetadataFile metadataFile = new MetadataFile();
            metadataFile.readParams(serializedData, true);
            arrayList.addAll(metadataFile.array);
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WebMetadataCache.$r8$lambda$zspukuyN0kEK8HOwNUHx6E_10zA(this.f$0, arrayList);
            }
        });
    }

    public static void $r8$lambda$zspukuyN0kEK8HOwNUHx6E_10zA(WebMetadataCache webMetadataCache, ArrayList arrayList) {
        webMetadataCache.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            WebMetadata webMetadata = (WebMetadata) arrayList.get(i);
            webMetadataCache.cache.put(webMetadata.domain, webMetadata);
        }
        webMetadataCache.loaded = true;
        webMetadataCache.loading = false;
    }

    public void scheduleSave() {
        AndroidUtilities.cancelRunOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.save();
            }
        });
        if (this.saving) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.save();
            }
        }, BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }

    public void save() {
        if (this.saving) {
            return;
        }
        this.saving = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        for (WebMetadata webMetadata : this.cache.values()) {
            if (!TextUtils.isEmpty(webMetadata.domain) && jCurrentTimeMillis - webMetadata.time <= 604800000) {
                arrayList.add(0, webMetadata);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                WebMetadataCache.$r8$lambda$g46RWQrFUs2ijBAvU24OJzuEsls(this.f$0, arrayList);
            }
        });
    }

    public static void $r8$lambda$g46RWQrFUs2ijBAvU24OJzuEsls(final WebMetadataCache webMetadataCache, ArrayList arrayList) {
        File cacheFile = webMetadataCache.getCacheFile();
        if (!cacheFile.exists()) {
            try {
                cacheFile.createNewFile();
            } catch (Exception e) {
                FileLog.e(e);
                webMetadataCache.saving = false;
                return;
            }
        }
        MetadataFile metadataFile = new MetadataFile();
        metadataFile.array.addAll(arrayList);
        SerializedData serializedData = new SerializedData(metadataFile.getObjectSize());
        metadataFile.serializeToStream(serializedData);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(cacheFile);
            fileOutputStream.write(serializedData.toByteArray());
            fileOutputStream.close();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.saving = false;
            }
        });
    }

    public void clear() {
        HashMap map = this.cache;
        if (map == null) {
            this.loading = false;
            this.loaded = true;
            this.cache = new HashMap();
        } else {
            map.clear();
        }
        scheduleSave();
    }
}
