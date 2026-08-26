package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

public final class WebMetadataCache {
    public static WebMetadataCache instance;
    public HashMap cache;
    public boolean loaded;
    public boolean loading;
    public boolean saving;

    public final class MetadataFile extends TLObject {
        public final ArrayList array = new ArrayList();

        @Override
        public final void readParams(InputSerializedData inputSerializedData, boolean z) {
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

        @Override
        public final void serializeToStream(OutputSerializedData outputSerializedData) {
            ArrayList arrayList = this.array;
            outputSerializedData.writeInt32(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                ((WebMetadata) arrayList.get(i)).serializeToStream(outputSerializedData);
            }
        }
    }

    public final class WebMetadata extends TLObject {
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
        public final void readParams(InputSerializedData inputSerializedData, boolean z) {
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

        @Override
        public final void serializeToStream(OutputSerializedData outputSerializedData) {
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
    }

    public final void load() {
        if (this.loaded || this.loading) {
            return;
        }
        this.loading = true;
        if (this.cache == null) {
            this.cache = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new WebMetadataCache$$ExternalSyntheticLambda0(this, 1));
    }

    public final void scheduleSave() {
        AndroidUtilities.cancelRunOnUIThread(new WebMetadataCache$$ExternalSyntheticLambda0(this, 0));
        if (this.saving) {
            return;
        }
        AndroidUtilities.runOnUIThread(new WebMetadataCache$$ExternalSyntheticLambda0(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
