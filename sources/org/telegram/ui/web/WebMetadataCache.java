package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.WebMetadataCache;

public class WebMetadataCache {
    private static WebMetadataCache instance;
    private HashMap<String, WebMetadata> cache;
    private boolean loaded;
    private boolean loading;
    private boolean saving;

    public static void lambda$retrieveFaviconAndSitename$5(String str) {
    }

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
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            Bitmap.CompressFormat compressFormat;
            abstractSerializedData.writeInt64(this.time);
            String str = this.domain;
            if (str == null) {
                str = "";
            }
            abstractSerializedData.writeString(str);
            String str2 = this.title;
            if (str2 == null) {
                str2 = "";
            }
            abstractSerializedData.writeString(str2);
            String str3 = this.sitename;
            abstractSerializedData.writeString(str3 != null ? str3 : "");
            abstractSerializedData.writeInt32(this.actionBarColor);
            abstractSerializedData.writeInt32(this.backgroundColor);
            if (this.favicon == null) {
                abstractSerializedData.writeInt32(1450380236);
                return;
            }
            abstractSerializedData.writeInt32(953850003);
            byte[] bArr = this.faviconBytes;
            if (bArr != null) {
                abstractSerializedData.writeByteArray(bArr);
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (Build.VERSION.SDK_INT >= 30) {
                Bitmap bitmap = this.favicon;
                compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
                bitmap.compress(compressFormat, 80, byteArrayOutputStream);
            } else {
                this.favicon.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.faviconBytes = byteArray;
            abstractSerializedData.writeByteArray(byteArray);
            try {
                byteArrayOutputStream.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.time = abstractSerializedData.readInt64(z);
            this.domain = abstractSerializedData.readString(z);
            this.title = abstractSerializedData.readString(z);
            this.sitename = abstractSerializedData.readString(z);
            this.actionBarColor = abstractSerializedData.readInt32(z);
            this.backgroundColor = abstractSerializedData.readInt32(z);
            if (abstractSerializedData.readInt32(z) == 1450380236) {
                this.favicon = null;
            } else {
                this.faviconBytes = abstractSerializedData.readByteArray(z);
                this.favicon = BitmapFactory.decodeStream(new ByteArrayInputStream(this.faviconBytes));
            }
        }
    }

    public static final class MetadataFile extends TLObject {
        public final ArrayList<WebMetadata> array;

        private MetadataFile() {
            this.array = new ArrayList<>();
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(this.array.size());
            for (int i = 0; i < this.array.size(); i++) {
                this.array.get(i).serializeToStream(abstractSerializedData);
            }
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt32; i++) {
                WebMetadata webMetadata = new WebMetadata();
                webMetadata.readParams(abstractSerializedData, z);
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
        WebMetadata webMetadata = this.cache.get(str);
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
            this.cache = new HashMap<>();
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
            this.cache = new HashMap<>();
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                WebMetadataCache.this.lambda$load$1();
            }
        });
    }

    public void lambda$load$1() {
        File cacheFile = getCacheFile();
        if (!cacheFile.exists()) {
            this.loaded = true;
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
                WebMetadataCache.this.lambda$load$0(arrayList);
            }
        });
    }

    public void lambda$load$0(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            WebMetadata webMetadata = (WebMetadata) arrayList.get(i);
            this.cache.put(webMetadata.domain, webMetadata);
        }
        this.loaded = true;
        this.loading = false;
    }

    public void scheduleSave() {
        AndroidUtilities.cancelRunOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WebMetadataCache.this.save();
            }
        });
        if (this.saving) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WebMetadataCache.this.save();
            }
        }, BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }

    public void save() {
        if (this.saving) {
            return;
        }
        this.saving = true;
        long currentTimeMillis = System.currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        for (WebMetadata webMetadata : this.cache.values()) {
            if (!TextUtils.isEmpty(webMetadata.domain) && currentTimeMillis - webMetadata.time <= 604800000) {
                arrayList.add(0, webMetadata);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                WebMetadataCache.this.lambda$save$3(arrayList);
            }
        });
    }

    public void lambda$save$3(ArrayList arrayList) {
        File cacheFile = getCacheFile();
        if (!cacheFile.exists()) {
            try {
                cacheFile.createNewFile();
            } catch (Exception e) {
                FileLog.e(e);
                this.saving = false;
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
                WebMetadataCache.this.lambda$save$2();
            }
        });
    }

    public void lambda$save$2() {
        this.saving = false;
    }

    public void clear() {
        HashMap<String, WebMetadata> hashMap = this.cache;
        if (hashMap == null) {
            this.loading = false;
            this.loaded = true;
            this.cache = new HashMap<>();
        } else {
            hashMap.clear();
        }
        scheduleSave();
    }

    public static class SitenameProxy {
        private final Utilities.Callback<String> whenReceived;

        public SitenameProxy(Utilities.Callback<String> callback) {
            this.whenReceived = callback;
        }

        @JavascriptInterface
        public void post(final String str, final String str2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    WebMetadataCache.SitenameProxy.this.lambda$post$0(str, str2);
                }
            });
        }

        public void lambda$post$0(String str, String str2) {
            str.hashCode();
            if (str.equals("siteNameEmpty")) {
                this.whenReceived.run(null);
            } else if (str.equals("siteName")) {
                this.whenReceived.run(str2);
            }
        }
    }

    public static void retrieveFaviconAndSitename(final String str, final Utilities.Callback2<String, Bitmap> callback2) {
        if (callback2 == null) {
            return;
        }
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity == null) {
            callback2.run(null, null);
            return;
        }
        View rootView = findActivity.findViewById(16908290).getRootView();
        if (!(rootView instanceof ViewGroup)) {
            callback2.run(null, null);
            return;
        }
        final FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                return false;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(500.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(500.0f), 1073741824));
            }
        };
        ((ViewGroup) rootView).addView(frameLayout);
        final WebView webView = new WebView(context);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setCacheMode(1);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        webView.setVerticalScrollBarEnabled(false);
        try {
            settings.setUserAgentString(settings.getUserAgentString().replace("; wv)", ")"));
        } catch (Exception e) {
            FileLog.e(e);
        }
        final boolean[] zArr = {false};
        final String[] strArr = {null};
        final Bitmap[] bitmapArr = {null};
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                WebMetadataCache.lambda$retrieveFaviconAndSitename$4(zArr, strArr, bitmapArr, str, webView, frameLayout, callback2, (Boolean) obj);
            }
        };
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onReceivedIcon(WebView webView2, Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                Bitmap bitmap2 = bitmapArr[0];
                if (bitmap2 == null || (bitmap2.getWidth() < bitmap.getWidth() && bitmapArr[0].getHeight() < bitmap.getHeight())) {
                    bitmapArr[0] = bitmap;
                    callback.run(Boolean.FALSE);
                }
            }
        });
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                WebMetadataCache.lambda$retrieveFaviconAndSitename$6(webView);
            }
        };
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView webView2, String str2) {
                super.onPageFinished(webView2, str2);
                runnable.run();
            }
        });
        webView.addJavascriptInterface(new SitenameProxy(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                WebMetadataCache.lambda$retrieveFaviconAndSitename$7(strArr, callback, (String) obj);
            }
        }), "TelegramWebview");
        frameLayout.addView(webView, LayoutHelper.createFrame(-1, -1.0f));
        webView.loadUrl(str);
        runnable.run();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WebMetadataCache.lambda$retrieveFaviconAndSitename$8(Utilities.Callback.this);
            }
        }, 10000L);
    }

    public static void lambda$retrieveFaviconAndSitename$4(boolean[] zArr, String[] strArr, Bitmap[] bitmapArr, String str, WebView webView, FrameLayout frameLayout, Utilities.Callback2 callback2, Boolean bool) {
        Bitmap bitmap;
        if (zArr[0]) {
            return;
        }
        if (bool.booleanValue() || (!TextUtils.isEmpty(strArr[0]) && (bitmap = bitmapArr[0]) != null && bitmap.getWidth() > AndroidUtilities.dp(28.0f) && bitmapArr[0].getHeight() > AndroidUtilities.dp(28.0f))) {
            zArr[0] = true;
            WebMetadata webMetadata = new WebMetadata();
            webMetadata.domain = AndroidUtilities.getHostAuthority(str, true);
            webMetadata.sitename = strArr[0];
            Bitmap bitmap2 = bitmapArr[0];
            if (bitmap2 != null) {
                webMetadata.favicon = Bitmap.createBitmap(bitmap2);
            }
            getInstance().save(webMetadata);
            webView.destroy();
            AndroidUtilities.removeFromParent(webView);
            AndroidUtilities.removeFromParent(frameLayout);
            callback2.run(strArr[0], bitmapArr[0]);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.webViewResolved, str);
        }
    }

    public static void lambda$retrieveFaviconAndSitename$6(WebView webView) {
        webView.evaluateJavascript(RLottieDrawable.readRes(null, R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), new ValueCallback() {
            @Override
            public final void onReceiveValue(Object obj) {
                WebMetadataCache.lambda$retrieveFaviconAndSitename$5((String) obj);
            }
        });
    }

    public static void lambda$retrieveFaviconAndSitename$7(String[] strArr, Utilities.Callback callback, String str) {
        strArr[0] = str;
        callback.run(Boolean.FALSE);
    }

    public static void lambda$retrieveFaviconAndSitename$8(Utilities.Callback callback) {
        callback.run(Boolean.TRUE);
    }
}
