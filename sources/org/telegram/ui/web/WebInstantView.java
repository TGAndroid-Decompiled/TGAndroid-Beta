package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda51;

public final class WebInstantView {
    public static final HashMap instants = new HashMap();
    public static HashMap loadingPhotos;
    public final HashMap loadedPhotos = new HashMap();
    public MHTML mhtml;
    public String url;
    public TLRPC.TL_webPage webpage;

    public final class AnonymousClass1 extends FrameLayout {
        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            return false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(500.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(500.0f), 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public final class AnonymousClass3 extends WebChromeClient {
    }

    public final class Loader {
        public AddressBarList$$ExternalSyntheticLambda4 cancelLocal;
        public boolean cancelled;
        public final int currentAccount;
        public boolean currentIsLoaded;
        public float currentProgress;
        public String currentUrl;
        public boolean gotLocal;
        public boolean gotRemote;
        public final ArrayList listeners = new ArrayList();
        public TLRPC.TL_webPage localPage;
        public TLRPC.WebPage remotePage;
        public int reqId;
        public boolean started;

        public Loader(int i) {
            this.currentAccount = i;
        }

        public final void cancel() {
            AddressBarList$$ExternalSyntheticLambda4 addressBarList$$ExternalSyntheticLambda4;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!this.gotRemote) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            }
            if (this.gotLocal || (addressBarList$$ExternalSyntheticLambda4 = this.cancelLocal) == null) {
                return;
            }
            addressBarList$$ExternalSyntheticLambda4.run();
        }

        public final TLRPC.WebPage getWebPage() {
            TLRPC.WebPage webPage;
            if (!SharedConfig.onlyLocalInstantView && (webPage = this.remotePage) != null) {
                return webPage;
            }
            TLRPC.TL_webPage tL_webPage = this.localPage;
            if (tL_webPage != null) {
                return tL_webPage;
            }
            return null;
        }

        public final void retryLocal(BotWebViewContainer.MyWebView myWebView) {
            if (this.cancelled) {
                return;
            }
            TLRPC.TL_webPage tL_webPage = this.localPage;
            if (tL_webPage != null) {
                WebInstantView.recycle(tL_webPage);
                this.localPage = null;
            }
            this.gotLocal = false;
            this.currentUrl = myWebView.getUrl();
            this.currentProgress = myWebView.getProgress();
            this.currentIsLoaded = myWebView.isPageLoaded;
            AddressBarList$$ExternalSyntheticLambda4 addressBarList$$ExternalSyntheticLambda4 = this.cancelLocal;
            if (addressBarList$$ExternalSyntheticLambda4 != null) {
                addressBarList$$ExternalSyntheticLambda4.run();
            }
            this.cancelLocal = WebInstantView.generate(myWebView, new WebInstantView$Loader$$ExternalSyntheticLambda0(this, 1));
        }
    }

    public final class WebPhoto extends TLRPC.Photo {
        public int h;
        public WebInstantView instantView;
        public String url;
        public final HashSet urls = new HashSet();
        public int w;
    }

    public static void addLastSpace(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            addLastSpace(richText2);
            return;
        }
        if (!richText.texts.isEmpty()) {
            addLastSpace((TL_iv.RichText) zzin.m(1, richText.texts));
            return;
        }
        if (!(richText instanceof TL_iv.textPlain) || (str = (textplain = (TL_iv.textPlain) richText).text) == null || str.endsWith(" ")) {
            return;
        }
        textplain.text += ' ';
    }

    public static void addNewLine(TL_iv.RichText richText) {
        if (richText == null) {
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            addNewLine(richText2);
            return;
        }
        if (!richText.texts.isEmpty()) {
            addNewLine((TL_iv.RichText) zzin.m(1, richText.texts));
            return;
        }
        if (richText instanceof TL_iv.textPlain) {
            StringBuilder sb = new StringBuilder();
            TL_iv.textPlain textplain = (TL_iv.textPlain) richText;
            sb.append(textplain.text);
            sb.append('\n');
            textplain.text = sb.toString();
        }
    }

    public static TL_iv.RichText filterRecursiveAnchorLinks(TL_iv.RichText richText, String str, String str2) {
        TL_iv.textUrl texturl;
        String str3;
        if (richText == null) {
            return richText;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
            for (int i = 0; i < textconcat.texts.size(); i++) {
                TL_iv.RichText richTextFilterRecursiveAnchorLinks = filterRecursiveAnchorLinks(textconcat.texts.get(i), str, str2);
                if (richTextFilterRecursiveAnchorLinks != null) {
                    textconcat2.texts.add(richTextFilterRecursiveAnchorLinks);
                }
            }
            return textconcat2;
        }
        if (!(richText instanceof TL_iv.textUrl) || (str3 = (texturl = (TL_iv.textUrl) richText).url) == null) {
            return richText;
        }
        if (!str3.toLowerCase().equals("#" + str2)) {
            if (!TextUtils.equals(texturl.url.toLowerCase(), str + "#" + str2)) {
                return richText;
            }
        }
        return null;
    }

    public static AddressBarList$$ExternalSyntheticLambda4 generate(BotWebViewContainer.MyWebView myWebView, Utilities.Callback callback) {
        if (myWebView == null) {
            callback.run(null);
            return null;
        }
        boolean[] zArr = {false};
        WebInstantView webInstantView = new WebInstantView();
        webInstantView.url = myWebView.getUrl();
        Timer timerCreate = Timer.create("WebInstantView");
        WebInstantView$$ExternalSyntheticLambda0 webInstantView$$ExternalSyntheticLambda0 = new WebInstantView$$ExternalSyntheticLambda0(Timer.start(timerCreate, "getHTML"), zArr, timerCreate, webInstantView, callback, 0);
        System.currentTimeMillis();
        myWebView.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "true"), new WebInstantView$$ExternalSyntheticLambda3(webInstantView, myWebView, new File(AndroidUtilities.getCacheDir(), "archive.mht"), webInstantView$$ExternalSyntheticLambda0, 0));
        return new AddressBarList$$ExternalSyntheticLambda4(zArr, 9);
    }

    public static boolean isInline(JSONArray jSONArray) throws JSONException {
        List listAsList = Arrays.asList("b", "strong", "span", "img", "i", "s", "a", "code", "mark", "sub", "sup");
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String strOptString = jSONObject.optString("tag");
                    if (!listAsList.contains(strOptString)) {
                        if ("div".equalsIgnoreCase(strOptString) || "span".equalsIgnoreCase(strOptString)) {
                            isInline(jSONObject.optJSONArray("content"));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static void recycle(TLRPC.WebPage webPage) {
        TL_iv.Page page;
        ArrayList<TLRPC.Photo> arrayList;
        HashMap map = instants;
        WebInstantView webInstantView = (WebInstantView) map.remove(webPage);
        if (webInstantView != null) {
            map.remove(webInstantView.webpage);
            HashMap map2 = webInstantView.loadedPhotos;
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                AndroidUtilities.recycleBitmap((Bitmap) ((Map.Entry) it.next()).getValue());
            }
            map2.clear();
            TLRPC.TL_webPage tL_webPage = webInstantView.webpage;
            if (tL_webPage == null || (page = tL_webPage.cached_page) == null || (arrayList = page.photos) == null) {
                return;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Photo photo = arrayList.get(i);
                i++;
                TLRPC.Photo photo2 = photo;
                if (photo2 instanceof WebPhoto) {
                    WebPhoto webPhoto = (WebPhoto) photo2;
                    HashMap map3 = loadingPhotos;
                    if (map3 != null) {
                        map3.remove(webPhoto.url);
                    }
                }
            }
        }
    }

    public static TL_iv.RichText trim(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return richText;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            trim(richText2);
            return richText;
        }
        if (richText.texts.size() == 1) {
            trim(richText.texts.get(0));
            return richText;
        }
        if (!richText.texts.isEmpty()) {
            trimStart(richText.texts.get(0));
            trimEnd((TL_iv.RichText) zzin.m(1, richText.texts));
            return richText;
        }
        if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
            textplain.text = str.trim();
        }
        return richText;
    }

    public static void trimEnd(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            trimEnd(richText2);
            return;
        }
        if (!richText.texts.isEmpty()) {
            trimEnd((TL_iv.RichText) zzin.m(1, richText.texts));
        } else {
            if (!(richText instanceof TL_iv.textPlain) || (str = (textplain = (TL_iv.textPlain) richText).text) == null) {
                return;
            }
            textplain.text = str.replaceAll("\\s+$", "");
        }
    }

    public static void trimStart(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            trimStart(richText2);
            return;
        }
        if (!richText.texts.isEmpty()) {
            trimStart(richText.texts.get(0));
        } else {
            if (!(richText instanceof TL_iv.textPlain) || (str = (textplain = (TL_iv.textPlain) richText).text) == null) {
                return;
            }
            textplain.text = str.replaceAll("^\\s+", "");
        }
    }

    public final void loadPhotoInternal(WebPhoto webPhoto, ImageReceiver imageReceiver, Runnable runnable) {
        MHTML.Entry entry;
        Bitmap bitmapDecodeStream;
        try {
            if (this.mhtml != null) {
                Iterator it = webPhoto.urls.iterator();
                entry = null;
                while (it.hasNext()) {
                    entry = (MHTML.Entry) ((HashMap) this.mhtml.entriesByLocation).get((String) it.next());
                    if (entry != null) {
                        break;
                    }
                }
            } else {
                entry = null;
            }
            if (entry == null) {
                HashMap map = this.loadedPhotos;
                if (map.containsKey(webPhoto.url)) {
                    imageReceiver.setImageBitmap((Bitmap) map.get(webPhoto.url));
                    return;
                }
                if (loadingPhotos == null) {
                    loadingPhotos = new HashMap();
                }
                ArrayList arrayList = (ArrayList) loadingPhotos.get(webPhoto.url);
                if (arrayList == null) {
                    loadingPhotos.put(webPhoto.url, new ArrayList());
                    new HttpGetBitmapTask(new RichEditor$$ExternalSyntheticLambda51(7, this, webPhoto)).execute(webPhoto.url);
                    return;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    if (((Pair) arrayList.get(i)).first == imageReceiver) {
                        return;
                    }
                }
                arrayList.add(new Pair(imageReceiver, runnable));
                return;
            }
            MHTML.HeaderValue headerValue = (MHTML.HeaderValue) entry.headers.get("content-type");
            if ((headerValue == null ? null : headerValue.value).contains("svg")) {
                if (webPhoto.w > 0 && webPhoto.h > 0) {
                    bitmapDecodeStream = SvgHelper.getBitmap((InputStream) entry.getInputStream(), AndroidUtilities.dp(webPhoto.w), AndroidUtilities.dp(webPhoto.h), false);
                }
                return;
            }
            if (webPhoto.w <= 0 || webPhoto.h <= 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(entry.getInputStream(), null, options);
                int i2 = webPhoto.w;
                if (i2 == 0 && webPhoto.h == 0) {
                    webPhoto.w = options.outWidth;
                    webPhoto.h = options.outHeight;
                } else if (i2 == 0) {
                    webPhoto.w = (int) ((options.outWidth / options.outHeight) * webPhoto.h);
                } else if (webPhoto.h == 0) {
                    webPhoto.h = (int) ((options.outHeight / options.outWidth) * i2);
                }
                runnable.run();
            }
            bitmapDecodeStream = BitmapFactory.decodeStream(entry.getInputStream());
            imageReceiver.setImageBitmap(bitmapDecodeStream);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final TL_iv.pageBlockPhoto parseImage(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        pageblockphoto.caption = new TL_iv.PageCaption();
        String strOptString = jSONObject.optString("alt");
        if (strOptString != null) {
            TL_iv.PageCaption pageCaption = pageblockphoto.caption;
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = strOptString;
            pageCaption.text = trim(textplain);
            TL_iv.PageCaption pageCaption2 = pageblockphoto.caption;
            TL_iv.textPlain textplain2 = new TL_iv.textPlain();
            textplain2.text = "";
            pageCaption2.credit = trim(textplain2);
        }
        String strOptString2 = jSONObject.optString("src");
        if (strOptString2 == null) {
            return null;
        }
        WebPhoto webPhoto = new WebPhoto();
        webPhoto.instantView = this;
        webPhoto.id = (-1) - tL_page.photos.size();
        webPhoto.url = strOptString2;
        webPhoto.urls.add(strOptString2);
        try {
            webPhoto.w = Integer.parseInt(jSONObject.optString("width"));
        } catch (Exception unused) {
        }
        try {
            webPhoto.h = Integer.parseInt(jSONObject.optString("height"));
        } catch (Exception unused2) {
        }
        if (webPhoto.w == 0) {
            webPhoto.w = webPhoto.h;
        }
        if (webPhoto.h == 0) {
            webPhoto.h = webPhoto.w;
        }
        pageblockphoto.photo_id = webPhoto.id;
        pageblockphoto.url = strOptString2;
        tL_page.photos.add(webPhoto);
        return pageblockphoto;
    }

    public final TLRPC.TL_webPage parseJSON(String str, JSONObject jSONObject) throws JSONException {
        TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
        tL_webPage.id = 0L;
        tL_webPage.url = str;
        tL_webPage.display_url = str;
        String string = jSONObject.getString("siteName");
        if (string != null && !"null".equals(string)) {
            tL_webPage.flags |= 2;
            tL_webPage.site_name = string;
        }
        String strOptString = jSONObject.optString("title");
        if (strOptString != null && !"null".equals(strOptString)) {
            tL_webPage.flags |= 4;
            tL_webPage.title = strOptString;
        }
        String strOptString2 = jSONObject.optString("byline");
        if (strOptString2 != null && !"null".equals(strOptString2) && !"by".equalsIgnoreCase(strOptString2)) {
            tL_webPage.flags |= 256;
            tL_webPage.author = strOptString2;
        }
        String strOptString3 = jSONObject.optString("excerpt");
        if (strOptString3 != null && !"null".equals(strOptString3)) {
            tL_webPage.flags |= 8;
            tL_webPage.description = strOptString3;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
        if (jSONArrayOptJSONArray != null && !"null".equals(jSONArrayOptJSONArray)) {
            tL_webPage.flags |= 1024;
            String strOptString4 = jSONObject.optString("title");
            if ("null".equals(strOptString4)) {
                strOptString4 = null;
            }
            "null".equals(jSONObject.optString("publishedTime"));
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("content");
            TL_iv.TL_page tL_page = new TL_iv.TL_page();
            tL_page.web = true;
            tL_page.url = str;
            tL_page.blocks.addAll(parsePageBlocks(jSONArrayOptJSONArray2, tL_page));
            if (tL_page.blocks.isEmpty() || !(tL_page.blocks.get(0) instanceof TL_iv.pageBlockHeader)) {
                TL_iv.pageBlockTitle pageblocktitle = new TL_iv.pageBlockTitle();
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = strOptString4;
                pageblocktitle.text = trim(textplain);
                tL_page.blocks.add(0, pageblocktitle);
            }
            tL_webPage.cached_page = tL_page;
        }
        return tL_webPage;
    }

    public final ArrayList parsePageBlocks(JSONArray jSONArray, TL_iv.TL_page tL_page) throws JSONException {
        char c;
        String str;
        WebPhoto webPhoto;
        TL_iv.pageBlockPhoto pageblockphoto;
        String str2;
        ?? pageblocklist;
        TL_iv.pageBlockDetails pageblockdetails;
        String str3 = "img";
        ?? r4 = 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = (String) obj;
                pageblockparagraph.text = textplain;
                arrayList.add(pageblockparagraph);
            } else {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String strOptString = jSONObject.optString("tag");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
                    strOptString.getClass();
                    byte b = -1;
                    switch (strOptString.hashCode()) {
                        case -1274639644:
                            c = 0;
                            if (strOptString.equals("figure")) {
                                b = 0;
                            }
                            break;
                        case -891980137:
                            c = 0;
                            if (strOptString.equals("strong")) {
                                b = 1;
                            }
                            break;
                        case -577741570:
                            c = 0;
                            if (strOptString.equals("picture")) {
                                b = 2;
                            }
                            break;
                        case 97:
                            c = 0;
                            if (strOptString.equals("a")) {
                                b = 3;
                            }
                            break;
                        case 98:
                            c = 0;
                            if (strOptString.equals("b")) {
                                b = 4;
                            }
                            break;
                        case 105:
                            c = 0;
                            if (strOptString.equals("i")) {
                                b = 5;
                            }
                            break;
                        case 112:
                            c = 0;
                            if (strOptString.equals("p")) {
                                b = 6;
                            }
                            break;
                        case 115:
                            c = 0;
                            if (strOptString.equals("s")) {
                                b = 7;
                            }
                            break;
                        case 3273:
                            c = 0;
                            if (strOptString.equals("h1")) {
                                b = 8;
                            }
                            break;
                        case 3274:
                            c = 0;
                            if (strOptString.equals("h2")) {
                                b = 9;
                            }
                            break;
                        case 3275:
                            c = 0;
                            if (strOptString.equals("h3")) {
                                b = 10;
                            }
                            break;
                        case 3276:
                            c = 0;
                            if (strOptString.equals("h4")) {
                                b = 11;
                            }
                            break;
                        case 3277:
                            c = 0;
                            if (strOptString.equals("h5")) {
                                b = 12;
                            }
                            break;
                        case 3278:
                            c = 0;
                            if (strOptString.equals("h6")) {
                                b = 13;
                            }
                            break;
                        case 3338:
                            c = 0;
                            if (strOptString.equals("hr")) {
                                b = 14;
                            }
                            break;
                        case 3549:
                            c = 0;
                            if (strOptString.equals("ol")) {
                                b = 15;
                            }
                            break;
                        case 3735:
                            c = 0;
                            if (strOptString.equals("ul")) {
                                b = 16;
                            }
                            break;
                        case 104387:
                            c = 0;
                            if (strOptString.equals(str3)) {
                                b = 17;
                            }
                            break;
                        case 111267:
                            c = 0;
                            if (strOptString.equals("pre")) {
                                b = 18;
                            }
                            break;
                        case 114240:
                            c = 0;
                            if (strOptString.equals("sub")) {
                                b = 19;
                            }
                            break;
                        case 114254:
                            c = 0;
                            if (strOptString.equals("sup")) {
                                b = 20;
                            }
                            break;
                        case 3059181:
                            c = 0;
                            if (strOptString.equals("code")) {
                                b = 21;
                            }
                            break;
                        case 3344077:
                            c = 0;
                            if (strOptString.equals("mark")) {
                                b = 22;
                            }
                            break;
                        case 3536714:
                            c = 0;
                            if (strOptString.equals("span")) {
                                b = 23;
                            }
                            break;
                        case 110115790:
                            c = 0;
                            if (strOptString.equals("table")) {
                                b = 24;
                            }
                            break;
                        case 1303202319:
                            c = 0;
                            if (strOptString.equals("blockquote")) {
                                b = 25;
                            }
                            break;
                        case 1557721666:
                            c = 0;
                            if (strOptString.equals("details")) {
                                b = 26;
                            }
                            break;
                        default:
                            c = 0;
                            break;
                    }
                    switch (b) {
                        case 0:
                        case 2:
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("content");
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = 0;
                            TL_iv.pageBlockPhoto image = null;
                            TL_iv.RichText richTextTrim = null;
                            while (i2 < jSONArrayOptJSONArray2.length()) {
                                Object obj2 = jSONArrayOptJSONArray2.get(i2);
                                if (obj2 instanceof JSONObject) {
                                    JSONObject jSONObject2 = (JSONObject) obj2;
                                    String strOptString2 = jSONObject2.optString("tag");
                                    if ("figurecaption".equalsIgnoreCase(strOptString2) || "caption".equalsIgnoreCase(strOptString2)) {
                                        str2 = str3;
                                        richTextTrim = trim(parseRichText(jSONObject2, tL_page));
                                    } else {
                                        if (str3.equalsIgnoreCase(strOptString2)) {
                                            image = parseImage(jSONObject2, tL_page);
                                        } else if ("source".equalsIgnoreCase(strOptString2)) {
                                            String strOptString3 = jSONObject2.optString("src");
                                            if (TextUtils.isEmpty(strOptString3)) {
                                                String strOptString4 = jSONObject2.optString("srcset");
                                                if (!TextUtils.isEmpty(strOptString4)) {
                                                    String[] strArrSplit = strOptString4.split(",");
                                                    int i3 = 0;
                                                    while (i3 < strArrSplit.length) {
                                                        arrayList2.add(strArrSplit[i3].trim().split(" ")[c].trim());
                                                        i3++;
                                                        str3 = str3;
                                                    }
                                                }
                                            } else {
                                                arrayList2.add(strOptString3);
                                            }
                                        }
                                        str2 = str3;
                                    }
                                } else {
                                    str2 = str3;
                                }
                                i2++;
                                str3 = str2;
                            }
                            str = str3;
                            if (image == null) {
                                pageblockphoto = null;
                            } else {
                                if (richTextTrim != null) {
                                    TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                                    image.caption = pageCaption;
                                    pageCaption.text = richTextTrim;
                                    pageCaption.credit = new TL_iv.textEmpty();
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= tL_page.photos.size()) {
                                        webPhoto = null;
                                    } else if ((tL_page.photos.get(i4) instanceof WebPhoto) && tL_page.photos.get(i4).id == image.photo_id) {
                                        webPhoto = (WebPhoto) tL_page.photos.get(i4);
                                    } else {
                                        i4++;
                                    }
                                }
                                if (webPhoto != null) {
                                    webPhoto.urls.addAll(arrayList2);
                                }
                                pageblockphoto = image;
                            }
                            if (pageblockphoto != null) {
                                arrayList.add(pageblockphoto);
                            }
                            break;
                        case 1:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put(jSONObject);
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph2.text = parseRichText(jSONArray2, tL_page);
                            arrayList.add(pageblockparagraph2);
                            str = str3;
                            break;
                        case 6:
                            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph3.text = trim(parseRichText(jSONObject, tL_page));
                            arrayList.add(pageblockparagraph3);
                            str = str3;
                            break;
                        case 8:
                            TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                            pageblockheading1.text = trim(parseRichText(jSONObject, tL_page));
                            arrayList.add(pageblockheading1);
                            str = str3;
                            break;
                        case 9:
                            TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                            pageblockheading2.text = trim(parseRichText(jSONObject, tL_page));
                            arrayList.add(pageblockheading2);
                            str = str3;
                            break;
                        case 10:
                            TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                            pageblockheading3.text = trim(parseRichText(jSONObject, tL_page));
                            arrayList.add(pageblockheading3);
                            str = str3;
                            break;
                        case 11:
                            TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                            pageblockheading4.text = trim(parseRichText(jSONObject, tL_page));
                            arrayList.add(pageblockheading4);
                            str = str3;
                            break;
                        case 12:
                            TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                            pageblockheading5.text = trim(parseRichText(jSONObject, tL_page));
                            arrayList.add(pageblockheading5);
                            str = str3;
                            break;
                        case 13:
                            TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                            pageblockheading6.text = trim(parseRichText(jSONObject, tL_page));
                            arrayList.add(pageblockheading6);
                            str = str3;
                            break;
                        case 14:
                            arrayList.add(new TL_iv.pageBlockDivider());
                            str = str3;
                            break;
                        case 15:
                        case 16:
                            if ("ol".equals(jSONObject.optString("tag"))) {
                                pageblocklist = new TL_iv.pageBlockOrderedList();
                                JSONArray jSONArray3 = jSONObject.getJSONArray("content");
                                for (int i5 = 0; i5 < jSONArray3.length(); i5++) {
                                    Object obj3 = jSONArray3.get(i5);
                                    if (obj3 instanceof JSONObject) {
                                        JSONObject jSONObject3 = (JSONObject) obj3;
                                        if ("li".equals(jSONObject3.optString("tag"))) {
                                            JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray("content");
                                            if (isInline(jSONArrayOptJSONArray3)) {
                                                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                                                tL_pageListOrderedItemText.text = parseRichText(jSONArrayOptJSONArray3, tL_page);
                                                pageblocklist.items.add(tL_pageListOrderedItemText);
                                            } else {
                                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                                                tL_pageListOrderedItemBlocks.blocks.addAll(parsePageBlocks(jSONArrayOptJSONArray3, tL_page));
                                                pageblocklist.items.add(tL_pageListOrderedItemBlocks);
                                            }
                                        }
                                    }
                                }
                            } else {
                                pageblocklist = new TL_iv.pageBlockList();
                                JSONArray jSONArray4 = jSONObject.getJSONArray("content");
                                for (int i6 = 0; i6 < jSONArray4.length(); i6++) {
                                    Object obj4 = jSONArray4.get(i6);
                                    if (obj4 instanceof JSONObject) {
                                        JSONObject jSONObject4 = (JSONObject) obj4;
                                        if ("li".equals(jSONObject4.optString("tag"))) {
                                            JSONArray jSONArrayOptJSONArray4 = jSONObject4.optJSONArray("content");
                                            if (isInline(jSONArrayOptJSONArray4)) {
                                                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                                                tL_pageListItemText.text = parseRichText(jSONArrayOptJSONArray4, tL_page);
                                                pageblocklist.items.add(tL_pageListItemText);
                                            } else {
                                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                                                tL_pageListItemBlocks.blocks.addAll(parsePageBlocks(jSONArrayOptJSONArray4, tL_page));
                                                pageblocklist.items.add(tL_pageListItemBlocks);
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList.add(pageblocklist);
                            str = str3;
                            break;
                        case 17:
                            TL_iv.pageBlockPhoto image2 = parseImage(jSONObject, tL_page);
                            if (image2 != null) {
                                arrayList.add(image2);
                            }
                            str = str3;
                            break;
                        case 18:
                            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                            TL_iv.textFixed textfixed = new TL_iv.textFixed();
                            textfixed.text = trim(parseRichText(jSONObject, tL_page));
                            pageblockpreformatted.text = textfixed;
                            pageblockpreformatted.language = "";
                            arrayList.add(pageblockpreformatted);
                            str = str3;
                            break;
                        case 24:
                            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
                            pageblocktable.bordered = r4;
                            pageblocktable.striped = r4;
                            String strOptString5 = jSONObject.optString("title");
                            String str4 = strOptString5 != null ? strOptString5 : "";
                            TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                            textplain2.text = str4;
                            String strOptString6 = jSONObject.optString("id");
                            TL_iv.RichText richText = textplain2;
                            if (!TextUtils.isEmpty(strOptString6)) {
                                TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                                textanchor.text = textplain2;
                                textanchor.name = strOptString6;
                                richText = textanchor;
                            }
                            pageblocktable.title = trim(richText);
                            pageblocktable.rows.addAll(parseTableRows(jSONObject.getJSONArray("content"), tL_page));
                            arrayList.add(pageblocktable);
                            str = str3;
                            break;
                        case 25:
                            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                            pageblockblockquote.text = trim(parseRichText(jSONObject, tL_page));
                            TL_iv.textItalic textitalic = new TL_iv.textItalic();
                            textitalic.text = pageblockblockquote.text;
                            pageblockblockquote.text = textitalic;
                            arrayList.add(pageblockblockquote);
                            str = str3;
                            break;
                        case 26:
                            TL_iv.pageBlockDetails pageblockdetails2 = new TL_iv.pageBlockDetails();
                            JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("content");
                            if (jSONArrayOptJSONArray5 == null) {
                                pageblockdetails = null;
                            } else {
                                for (int i7 = 0; i7 < jSONArrayOptJSONArray5.length(); i7 += r4) {
                                    Object obj5 = jSONArrayOptJSONArray5.get(i7);
                                    if (obj5 instanceof JSONObject) {
                                        JSONObject jSONObject5 = (JSONObject) obj5;
                                        if ("summary".equals(jSONObject5.optString("tag"))) {
                                            pageblockdetails2.title = trim(parseRichText(jSONObject5, tL_page));
                                            jSONArrayOptJSONArray5.remove(i7);
                                            pageblockdetails2.blocks.addAll(parsePageBlocks(jSONArrayOptJSONArray5, tL_page));
                                            pageblockdetails2.open = jSONObject.has("open");
                                            pageblockdetails = pageblockdetails2;
                                        }
                                    }
                                }
                                pageblockdetails2.blocks.addAll(parsePageBlocks(jSONArrayOptJSONArray5, tL_page));
                                pageblockdetails2.open = jSONObject.has("open");
                                pageblockdetails = pageblockdetails2;
                            }
                            if (pageblockdetails != null) {
                                arrayList.add(pageblockdetails);
                            }
                            str = str3;
                            break;
                        default:
                            if (jSONArrayOptJSONArray != null) {
                                arrayList.addAll(parsePageBlocks(jSONArrayOptJSONArray, tL_page));
                            }
                            str = str3;
                            break;
                    }
                }
                i++;
                str3 = str;
                r4 = 1;
            }
            str = str3;
            i++;
            str3 = str;
            r4 = 1;
        }
        return arrayList;
    }

    public final TL_iv.RichText parseRichText(JSONObject jSONObject, TL_iv.TL_page tL_page) throws JSONException {
        TL_iv.RichText richText = parseRichText(jSONObject.getJSONArray("content"), tL_page);
        String strOptString = jSONObject.optString("id");
        if (!TextUtils.isEmpty(strOptString)) {
            TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
            textanchor.text = richText;
            textanchor.name = strOptString;
            richText = textanchor;
        }
        if (jSONObject.has("bold")) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = richText;
            richText = textbold;
        }
        if (!jSONObject.has("italic")) {
            return richText;
        }
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = richText;
        return textitalic;
    }

    public final ArrayList parseTableRows(JSONArray jSONArray, TL_iv.TL_page tL_page) throws JSONException {
        JSONObject jSONObject;
        String strOptString;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if ("tr".equals(jSONObject2.optString("tag"))) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("content");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        Object obj2 = jSONArray2.get(i2);
                        if ((obj2 instanceof JSONObject) && (strOptString = (jSONObject = (JSONObject) obj2).optString("tag")) != null && ("td".equals(strOptString) || "th".equals(strOptString))) {
                            TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                            pagetablecell.header = "th".equals(strOptString);
                            try {
                                pagetablecell.colspan = Integer.parseInt(jSONObject.optString("colspan"));
                                pagetablecell.flags |= 2;
                            } catch (Exception unused) {
                            }
                            try {
                                pagetablecell.rowspan = Integer.parseInt(jSONObject.optString("rowspan"));
                                pagetablecell.flags |= 4;
                            } catch (Exception unused2) {
                            }
                            pagetablecell.text = trim(parseRichText(jSONObject.getJSONArray("content"), tL_page));
                            if (jSONObject.has("bold") || pagetablecell.header) {
                                TL_iv.textBold textbold = new TL_iv.textBold();
                                textbold.text = pagetablecell.text;
                                pagetablecell.text = textbold;
                            }
                            if (jSONObject.has("italic")) {
                                TL_iv.textItalic textitalic = new TL_iv.textItalic();
                                textitalic.text = pagetablecell.text;
                                pagetablecell.text = textitalic;
                            }
                            pagetablecell.align_center = jSONObject.has("xcenter");
                            pagetablerow.cells.add(pagetablecell);
                        }
                    }
                    arrayList.add(pagetablerow);
                } else {
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("content");
                    if (jSONArrayOptJSONArray != null) {
                        arrayList.addAll(parseTableRows(jSONArrayOptJSONArray, tL_page));
                    }
                }
            }
        }
        return arrayList;
    }

    public final TL_iv.RichText parseRichText(JSONArray jSONArray, TL_iv.TL_page tL_page) throws JSONException {
        int i;
        TL_iv.textUrl texturl;
        TL_iv.textEmail textemail;
        TL_iv.textPhone textphone;
        TL_iv.RichText richText;
        TL_iv.RichText richText2;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof String) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = (String) obj;
                arrayList.add(textplain);
                i = i2;
            } else {
                JSONObject jSONObject = (JSONObject) obj;
                String strOptString = jSONObject.optString("tag");
                strOptString.getClass();
                TL_iv.RichText richText3 = null;
                TL_iv.RichText richText4 = null;
                richText3 = null;
                switch (strOptString) {
                    case "strong":
                    case "b":
                        i = i2;
                        TL_iv.textBold textbold = new TL_iv.textBold();
                        textbold.text = parseRichText(jSONObject, tL_page);
                        richText3 = textbold;
                        break;
                    case "a":
                        i = i2;
                        String strOptString2 = jSONObject.optString("href");
                        if (strOptString2 == null) {
                            richText = parseRichText(jSONObject, tL_page);
                            break;
                        } else {
                            if (strOptString2.startsWith("tel:")) {
                                textphone = new TL_iv.textPhone();
                                textphone.phone = strOptString2.substring(4);
                                textphone.text = parseRichText(jSONObject, tL_page);
                            } else if (strOptString2.startsWith("mailto:")) {
                                textemail = new TL_iv.textEmail();
                                textemail.email = strOptString2.substring(7);
                                textemail.text = parseRichText(jSONObject, tL_page);
                            } else {
                                texturl = new TL_iv.textUrl();
                                texturl.url = strOptString2;
                                texturl.text = parseRichText(jSONObject, tL_page);
                            }
                            break;
                        }
                        break;
                    case "i":
                        i = i2;
                        TL_iv.textItalic textitalic = new TL_iv.textItalic();
                        textitalic.text = parseRichText(jSONObject, tL_page);
                        richText3 = textitalic;
                        break;
                    case "p":
                        i = i2;
                        if (!arrayList.isEmpty()) {
                            addNewLine((TL_iv.RichText) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList));
                        }
                        richText3 = parseRichText(jSONObject, tL_page);
                        break;
                    case "s":
                        i = i2;
                        TL_iv.textStrike textstrike = new TL_iv.textStrike();
                        textstrike.text = parseRichText(jSONObject, tL_page);
                        richText3 = textstrike;
                        break;
                    case "br":
                        i = i2;
                        if (!arrayList.isEmpty()) {
                            addNewLine((TL_iv.RichText) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList));
                            break;
                        }
                        break;
                    case "img":
                        if (!arrayList.isEmpty()) {
                            addLastSpace((TL_iv.RichText) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList));
                        }
                        TL_iv.textImage textimage = new TL_iv.textImage();
                        String strOptString3 = jSONObject.optString("src");
                        if (strOptString3 == null) {
                            i = i2;
                            richText3 = richText4;
                            break;
                        } else {
                            WebPhoto webPhoto = new WebPhoto();
                            webPhoto.instantView = this;
                            i = i2;
                            webPhoto.id = (-1) - tL_page.photos.size();
                            webPhoto.url = strOptString3;
                            webPhoto.urls.add(strOptString3);
                            try {
                                webPhoto.w = Integer.parseInt(jSONObject.optString("width"));
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                webPhoto.h = Integer.parseInt(jSONObject.optString("height"));
                                break;
                            } catch (Exception unused2) {
                            }
                            textimage.url = strOptString3;
                            tL_page.photos.add(webPhoto);
                            if (webPhoto.w == 0) {
                                webPhoto.w = webPhoto.h;
                            }
                            if (webPhoto.h == 0) {
                                webPhoto.h = webPhoto.w;
                            }
                            try {
                                textimage.w = Integer.parseInt(jSONObject.optString("width"));
                                break;
                            } catch (Exception unused3) {
                            }
                            try {
                                textimage.h = Integer.parseInt(jSONObject.optString("height"));
                                break;
                            } catch (Exception unused4) {
                            }
                            if (textimage.w == 0) {
                                textimage.w = textimage.h;
                            }
                            if (textimage.h == 0) {
                                textimage.h = textimage.w;
                            }
                            textimage.photo_id = webPhoto.id;
                            richText3 = textimage;
                            break;
                        }
                        break;
                    case "pre":
                    case "code":
                        TL_iv.textFixed textfixed = new TL_iv.textFixed();
                        textfixed.text = parseRichText(jSONObject, tL_page);
                        richText4 = textfixed;
                        i = i2;
                        richText3 = richText4;
                        break;
                    case "sub":
                        TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
                        textsubscript.text = parseRichText(jSONObject, tL_page);
                        richText4 = textsubscript;
                        i = i2;
                        richText3 = richText4;
                        break;
                    case "sup":
                        TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
                        textsuperscript.text = parseRichText(jSONObject, tL_page);
                        richText4 = textsuperscript;
                        i = i2;
                        richText3 = richText4;
                        break;
                    case "mark":
                        TL_iv.textMarked textmarked = new TL_iv.textMarked();
                        textmarked.text = parseRichText(jSONObject, tL_page);
                        richText4 = textmarked;
                        i = i2;
                        richText3 = richText4;
                        break;
                    default:
                        richText4 = parseRichText(jSONObject, tL_page);
                        i = i2;
                        richText3 = richText4;
                        break;
                }
                if (richText3 != null) {
                    richText3 = texturl;
                    richText3 = textemail;
                    richText3 = textphone;
                    richText3 = richText;
                    String strOptString4 = jSONObject.optString("id");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        richText2 = richText3;
                        TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                        textanchor.text = richText3;
                        textanchor.name = strOptString4;
                        richText2 = textanchor;
                    }
                    richText2 = richText3;
                    arrayList.add(richText2);
                } else {
                    richText3 = texturl;
                    richText3 = textemail;
                    richText3 = textphone;
                    richText3 = richText;
                }
            }
            i2 = i + 1;
        }
        if (arrayList.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }
}
