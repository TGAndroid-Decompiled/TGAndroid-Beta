package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ib0;

public final class e2 {

    public static final HashMap f43822e = new HashMap();

    public static HashMap f43823f;

    public String f43824a;

    public com.google.firebase.messaging.t f43825b;

    public TLRPC.TL_webPage f43826c;
    public final HashMap d = new HashMap();

    public static void a(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            a(richText2);
            return;
        }
        if (!richText.texts.isEmpty()) {
            a((TL_iv.RichText) i0.a.i(1, richText.texts));
            return;
        }
        if (!(richText instanceof TL_iv.textPlain) || (str = (textplain = (TL_iv.textPlain) richText).text) == null || str.endsWith(" ")) {
            return;
        }
        textplain.text += ' ';
    }

    public static void b(TL_iv.RichText richText) {
        if (richText == null) {
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            b(richText2);
            return;
        }
        if (!richText.texts.isEmpty()) {
            b((TL_iv.RichText) i0.a.i(1, richText.texts));
            return;
        }
        if (richText instanceof TL_iv.textPlain) {
            StringBuilder sb2 = new StringBuilder();
            TL_iv.textPlain textplain = (TL_iv.textPlain) richText;
            sb2.append(textplain.text);
            sb2.append('\n');
            textplain.text = sb2.toString();
        }
    }

    public static TL_iv.RichText c(TL_iv.RichText richText, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("id");
        if (TextUtils.isEmpty(strOptString)) {
            return richText;
        }
        TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
        textanchor.text = richText;
        textanchor.name = strOptString;
        return textanchor;
    }

    public static TL_iv.RichText d(TL_iv.RichText richText, String str, String str2) {
        TL_iv.textUrl texturl;
        String str3;
        if (richText == null) {
            return richText;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                TL_iv.RichText richTextD = d(textconcat.texts.get(i10), str, str2);
                if (richTextD != null) {
                    textconcat2.texts.add(richTextD);
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

    public static nh.f0 e(w0 w0Var, Utilities.Callback callback) {
        if (w0Var == null) {
            callback.run(null);
            return null;
        }
        boolean[] zArr = {false};
        e2 e2Var = new e2();
        e2Var.f43824a = w0Var.getUrl();
        Timer timerCreate = Timer.create("WebInstantView");
        w1 w1Var = new w1(Timer.start(timerCreate, "getHTML"), zArr, timerCreate, e2Var, callback, 0);
        System.currentTimeMillis();
        w0Var.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "true"), new x1(e2Var, w0Var, new File(AndroidUtilities.getCacheDir(), "archive.mht"), w1Var, 0));
        return new nh.f0(zArr, 28);
    }

    public static boolean f(JSONArray jSONArray) throws JSONException {
        List listAsList = Arrays.asList("b", "strong", "span", "img", "i", "s", "a", "code", "mark", "sub", "sup");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String strOptString = jSONObject.optString("tag");
                    if (!listAsList.contains(strOptString)) {
                        if ("div".equalsIgnoreCase(strOptString) || "span".equalsIgnoreCase(strOptString)) {
                            f(jSONObject.optJSONArray("content"));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static void g(d2 d2Var, ImageReceiver imageReceiver, Runnable runnable) {
        e2 e2Var;
        h1 h1Var;
        Bitmap bitmapDecodeStream;
        if (d2Var == null || (e2Var = d2Var.f43812a) == null) {
            return;
        }
        HashMap map = e2Var.d;
        try {
            if (e2Var.f43825b != null) {
                Iterator it = d2Var.f43814c.iterator();
                h1Var = null;
                while (it.hasNext()) {
                    h1Var = (h1) ((HashMap) e2Var.f43825b.d).get((String) it.next());
                    if (h1Var != null) {
                        break;
                    }
                }
            } else {
                h1Var = null;
            }
            if (h1Var == null) {
                if (map.containsKey(d2Var.f43813b)) {
                    imageReceiver.setImageBitmap((Bitmap) map.get(d2Var.f43813b));
                    return;
                }
                if (f43823f == null) {
                    f43823f = new HashMap();
                }
                ArrayList arrayList = (ArrayList) f43823f.get(d2Var.f43813b);
                if (arrayList == null) {
                    f43823f.put(d2Var.f43813b, new ArrayList());
                    new e1(new ib0(16, e2Var, d2Var)).execute(d2Var.f43813b);
                    return;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((Pair) arrayList.get(i10)).first == imageReceiver) {
                        return;
                    }
                }
                arrayList.add(new Pair(imageReceiver, runnable));
                return;
            }
            i1 i1Var = (i1) h1Var.f43848a.get("content-type");
            if ((i1Var == null ? null : i1Var.f43864a).contains("svg")) {
                if (d2Var.d > 0 && d2Var.f43815e > 0) {
                    bitmapDecodeStream = SvgHelper.getBitmap((InputStream) h1Var.a(), AndroidUtilities.dp(d2Var.d), AndroidUtilities.dp(d2Var.f43815e), false);
                }
                return;
            }
            if (d2Var.d <= 0 || d2Var.f43815e <= 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(h1Var.a(), null, options);
                int i11 = d2Var.d;
                if (i11 == 0 && d2Var.f43815e == 0) {
                    d2Var.d = options.outWidth;
                    d2Var.f43815e = options.outHeight;
                } else if (i11 == 0) {
                    d2Var.d = (int) ((options.outWidth / options.outHeight) * d2Var.f43815e);
                } else if (d2Var.f43815e == 0) {
                    d2Var.f43815e = (int) ((options.outHeight / options.outWidth) * i11);
                }
                runnable.run();
            }
            bitmapDecodeStream = BitmapFactory.decodeStream(h1Var.a());
            imageReceiver.setImageBitmap(bitmapDecodeStream);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static TL_iv.textPlain m(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        return textplain;
    }

    public static void o(TLRPC.WebPage webPage) {
        TL_iv.Page page;
        ArrayList<TLRPC.Photo> arrayList;
        HashMap map = f43822e;
        e2 e2Var = (e2) map.remove(webPage);
        if (e2Var != null) {
            map.remove(e2Var.f43826c);
            HashMap map2 = e2Var.d;
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                AndroidUtilities.recycleBitmap((Bitmap) ((Map.Entry) it.next()).getValue());
            }
            map2.clear();
            TLRPC.TL_webPage tL_webPage = e2Var.f43826c;
            if (tL_webPage == null || (page = tL_webPage.cached_page) == null || (arrayList = page.photos) == null) {
                return;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Photo photo = arrayList.get(i10);
                i10++;
                TLRPC.Photo photo2 = photo;
                if (photo2 instanceof d2) {
                    d2 d2Var = (d2) photo2;
                    HashMap map3 = f43823f;
                    if (map3 != null) {
                        map3.remove(d2Var.f43813b);
                    }
                }
            }
        }
    }

    public static TL_iv.RichText p(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return richText;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            p(richText2);
            return richText;
        }
        if (richText.texts.size() == 1) {
            p(richText.texts.get(0));
            return richText;
        }
        if (!richText.texts.isEmpty()) {
            r(richText.texts.get(0));
            q((TL_iv.RichText) i0.a.i(1, richText.texts));
            return richText;
        }
        if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
            textplain.text = str.trim();
        }
        return richText;
    }

    public static void q(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            q(richText2);
            return;
        }
        if (!richText.texts.isEmpty()) {
            q((TL_iv.RichText) i0.a.i(1, richText.texts));
        } else {
            if (!(richText instanceof TL_iv.textPlain) || (str = (textplain = (TL_iv.textPlain) richText).text) == null) {
                return;
            }
            textplain.text = str.replaceAll("\\s+$", "");
        }
    }

    public static void r(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            r(richText2);
            return;
        }
        if (!richText.texts.isEmpty()) {
            r(richText.texts.get(0));
        } else {
            if (!(richText instanceof TL_iv.textPlain) || (str = (textplain = (TL_iv.textPlain) richText).text) == null) {
                return;
            }
            textplain.text = str.replaceAll("^\\s+", "");
        }
    }

    public final TL_iv.pageBlockPhoto h(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        pageblockphoto.caption = new TL_iv.PageCaption();
        String strOptString = jSONObject.optString("alt");
        if (strOptString != null) {
            pageblockphoto.caption.text = p(m(strOptString));
            pageblockphoto.caption.credit = p(m(""));
        }
        String strOptString2 = jSONObject.optString("src");
        if (strOptString2 == null) {
            return null;
        }
        d2 d2Var = new d2();
        d2Var.f43812a = this;
        d2Var.f22404id = (-1) - tL_page.photos.size();
        d2Var.f43813b = strOptString2;
        d2Var.f43814c.add(strOptString2);
        try {
            d2Var.d = Integer.parseInt(jSONObject.optString("width"));
        } catch (Exception unused) {
        }
        try {
            d2Var.f43815e = Integer.parseInt(jSONObject.optString("height"));
        } catch (Exception unused2) {
        }
        if (d2Var.d == 0) {
            d2Var.d = d2Var.f43815e;
        }
        if (d2Var.f43815e == 0) {
            d2Var.f43815e = d2Var.d;
        }
        pageblockphoto.photo_id = d2Var.f22404id;
        pageblockphoto.url = strOptString2;
        tL_page.photos.add(d2Var);
        return pageblockphoto;
    }

    public final TLRPC.TL_webPage i(String str, JSONObject jSONObject) throws JSONException {
        TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
        tL_webPage.f22533id = 0L;
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
            tL_page.blocks.addAll(j(jSONArrayOptJSONArray2, tL_page));
            if (tL_page.blocks.isEmpty() || !(tL_page.blocks.get(0) instanceof TL_iv.pageBlockHeader)) {
                TL_iv.pageBlockTitle pageblocktitle = new TL_iv.pageBlockTitle();
                pageblocktitle.text = p(m(strOptString4));
                tL_page.blocks.add(0, pageblocktitle);
            }
            tL_webPage.cached_page = tL_page;
        }
        return tL_webPage;
    }

    public final ArrayList j(JSONArray jSONArray, TL_iv.TL_page tL_page) throws JSONException {
        d2 d2Var;
        TL_iv.pageBlockPhoto pageblockphoto;
        ?? pageblocklist;
        TL_iv.pageBlockDetails pageblockdetails;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof String) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = m((String) obj);
                arrayList.add(pageblockparagraph);
            } else {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String strOptString = jSONObject.optString("tag");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
                    strOptString.getClass();
                    byte b10 = -1;
                    switch (strOptString.hashCode()) {
                        case -1274639644:
                            if (strOptString.equals("figure")) {
                                b10 = 0;
                            }
                            break;
                        case -891980137:
                            if (strOptString.equals("strong")) {
                                b10 = 1;
                            }
                            break;
                        case -577741570:
                            if (strOptString.equals("picture")) {
                                b10 = 2;
                            }
                            break;
                        case 97:
                            if (strOptString.equals("a")) {
                                b10 = 3;
                            }
                            break;
                        case 98:
                            if (strOptString.equals("b")) {
                                b10 = 4;
                            }
                            break;
                        case 105:
                            if (strOptString.equals("i")) {
                                b10 = 5;
                            }
                            break;
                        case 112:
                            if (strOptString.equals("p")) {
                                b10 = 6;
                            }
                            break;
                        case 115:
                            if (strOptString.equals("s")) {
                                b10 = 7;
                            }
                            break;
                        case 3273:
                            if (strOptString.equals("h1")) {
                                b10 = 8;
                            }
                            break;
                        case 3274:
                            if (strOptString.equals("h2")) {
                                b10 = 9;
                            }
                            break;
                        case 3275:
                            if (strOptString.equals("h3")) {
                                b10 = 10;
                            }
                            break;
                        case 3276:
                            if (strOptString.equals("h4")) {
                                b10 = 11;
                            }
                            break;
                        case 3277:
                            if (strOptString.equals("h5")) {
                                b10 = 12;
                            }
                            break;
                        case 3278:
                            if (strOptString.equals("h6")) {
                                b10 = 13;
                            }
                            break;
                        case 3338:
                            if (strOptString.equals("hr")) {
                                b10 = 14;
                            }
                            break;
                        case 3549:
                            if (strOptString.equals("ol")) {
                                b10 = 15;
                            }
                            break;
                        case 3735:
                            if (strOptString.equals("ul")) {
                                b10 = 16;
                            }
                            break;
                        case 104387:
                            if (strOptString.equals("img")) {
                                b10 = 17;
                            }
                            break;
                        case 111267:
                            if (strOptString.equals("pre")) {
                                b10 = 18;
                            }
                            break;
                        case 114240:
                            if (strOptString.equals("sub")) {
                                b10 = 19;
                            }
                            break;
                        case 114254:
                            if (strOptString.equals("sup")) {
                                b10 = 20;
                            }
                            break;
                        case 3059181:
                            if (strOptString.equals("code")) {
                                b10 = 21;
                            }
                            break;
                        case 3344077:
                            if (strOptString.equals("mark")) {
                                b10 = 22;
                            }
                            break;
                        case 3536714:
                            if (strOptString.equals("span")) {
                                b10 = 23;
                            }
                            break;
                        case 110115790:
                            if (strOptString.equals("table")) {
                                b10 = 24;
                            }
                            break;
                        case 1303202319:
                            if (strOptString.equals("blockquote")) {
                                b10 = 25;
                            }
                            break;
                        case 1557721666:
                            if (strOptString.equals("details")) {
                                b10 = 26;
                            }
                            break;
                    }
                    switch (b10) {
                        case 0:
                        case 2:
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("content");
                            ArrayList arrayList2 = new ArrayList();
                            TL_iv.pageBlockPhoto pageblockphotoH = null;
                            TL_iv.RichText richTextP = null;
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                                Object obj2 = jSONArrayOptJSONArray2.get(i11);
                                if (obj2 instanceof JSONObject) {
                                    JSONObject jSONObject2 = (JSONObject) obj2;
                                    String strOptString2 = jSONObject2.optString("tag");
                                    if ("figurecaption".equalsIgnoreCase(strOptString2) || "caption".equalsIgnoreCase(strOptString2)) {
                                        richTextP = p(l(jSONObject2, tL_page));
                                    } else if ("img".equalsIgnoreCase(strOptString2)) {
                                        pageblockphotoH = h(jSONObject2, tL_page);
                                    } else if ("source".equalsIgnoreCase(strOptString2)) {
                                        String strOptString3 = jSONObject2.optString("src");
                                        if (TextUtils.isEmpty(strOptString3)) {
                                            String strOptString4 = jSONObject2.optString("srcset");
                                            if (!TextUtils.isEmpty(strOptString4)) {
                                                for (String str : strOptString4.split(",")) {
                                                    arrayList2.add(str.trim().split(" ")[0].trim());
                                                }
                                            }
                                        } else {
                                            arrayList2.add(strOptString3);
                                        }
                                    }
                                }
                            }
                            if (pageblockphotoH == null) {
                                pageblockphoto = null;
                            } else {
                                if (richTextP != null) {
                                    TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                                    pageblockphotoH.caption = pageCaption;
                                    pageCaption.text = richTextP;
                                    pageCaption.credit = new TL_iv.textEmpty();
                                }
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= tL_page.photos.size()) {
                                        d2Var = null;
                                    } else if ((tL_page.photos.get(i12) instanceof d2) && tL_page.photos.get(i12).f22404id == pageblockphotoH.photo_id) {
                                        d2Var = (d2) tL_page.photos.get(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                                if (d2Var != null) {
                                    d2Var.f43814c.addAll(arrayList2);
                                }
                                pageblockphoto = pageblockphotoH;
                            }
                            if (pageblockphoto != null) {
                                arrayList.add(pageblockphoto);
                                continue;
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
                            pageblockparagraph2.text = k(jSONArray2, tL_page);
                            arrayList.add(pageblockparagraph2);
                            break;
                        case 6:
                            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph3.text = p(l(jSONObject, tL_page));
                            arrayList.add(pageblockparagraph3);
                            break;
                        case 8:
                            TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                            pageblockheading1.text = p(l(jSONObject, tL_page));
                            arrayList.add(pageblockheading1);
                            break;
                        case 9:
                            TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                            pageblockheading2.text = p(l(jSONObject, tL_page));
                            arrayList.add(pageblockheading2);
                            break;
                        case 10:
                            TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                            pageblockheading3.text = p(l(jSONObject, tL_page));
                            arrayList.add(pageblockheading3);
                            break;
                        case 11:
                            TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                            pageblockheading4.text = p(l(jSONObject, tL_page));
                            arrayList.add(pageblockheading4);
                            break;
                        case 12:
                            TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                            pageblockheading5.text = p(l(jSONObject, tL_page));
                            arrayList.add(pageblockheading5);
                            break;
                        case 13:
                            TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                            pageblockheading6.text = p(l(jSONObject, tL_page));
                            arrayList.add(pageblockheading6);
                            break;
                        case 14:
                            arrayList.add(new TL_iv.pageBlockDivider());
                            break;
                        case 15:
                        case 16:
                            if ("ol".equals(jSONObject.optString("tag"))) {
                                pageblocklist = new TL_iv.pageBlockOrderedList();
                                JSONArray jSONArray3 = jSONObject.getJSONArray("content");
                                for (int i13 = 0; i13 < jSONArray3.length(); i13++) {
                                    Object obj3 = jSONArray3.get(i13);
                                    if (obj3 instanceof JSONObject) {
                                        JSONObject jSONObject3 = (JSONObject) obj3;
                                        if ("li".equals(jSONObject3.optString("tag"))) {
                                            JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray("content");
                                            if (f(jSONArrayOptJSONArray3)) {
                                                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                                                tL_pageListOrderedItemText.text = k(jSONArrayOptJSONArray3, tL_page);
                                                pageblocklist.items.add(tL_pageListOrderedItemText);
                                            } else {
                                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                                                tL_pageListOrderedItemBlocks.blocks.addAll(j(jSONArrayOptJSONArray3, tL_page));
                                                pageblocklist.items.add(tL_pageListOrderedItemBlocks);
                                            }
                                        }
                                    }
                                }
                            } else {
                                pageblocklist = new TL_iv.pageBlockList();
                                JSONArray jSONArray4 = jSONObject.getJSONArray("content");
                                for (int i14 = 0; i14 < jSONArray4.length(); i14++) {
                                    Object obj4 = jSONArray4.get(i14);
                                    if (obj4 instanceof JSONObject) {
                                        JSONObject jSONObject4 = (JSONObject) obj4;
                                        if ("li".equals(jSONObject4.optString("tag"))) {
                                            JSONArray jSONArrayOptJSONArray4 = jSONObject4.optJSONArray("content");
                                            if (f(jSONArrayOptJSONArray4)) {
                                                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                                                tL_pageListItemText.text = k(jSONArrayOptJSONArray4, tL_page);
                                                pageblocklist.items.add(tL_pageListItemText);
                                            } else {
                                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                                                tL_pageListItemBlocks.blocks.addAll(j(jSONArrayOptJSONArray4, tL_page));
                                                pageblocklist.items.add(tL_pageListItemBlocks);
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList.add(pageblocklist);
                            break;
                        case 17:
                            TL_iv.pageBlockPhoto pageblockphotoH2 = h(jSONObject, tL_page);
                            if (pageblockphotoH2 != null) {
                                arrayList.add(pageblockphotoH2);
                            }
                            break;
                        case 18:
                            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                            TL_iv.textFixed textfixed = new TL_iv.textFixed();
                            textfixed.text = p(l(jSONObject, tL_page));
                            pageblockpreformatted.text = textfixed;
                            pageblockpreformatted.language = "";
                            arrayList.add(pageblockpreformatted);
                            break;
                        case 24:
                            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
                            pageblocktable.bordered = true;
                            pageblocktable.striped = true;
                            String strOptString5 = jSONObject.optString("title");
                            pageblocktable.title = p(c(m(strOptString5 != null ? strOptString5 : ""), jSONObject));
                            pageblocktable.rows.addAll(n(jSONObject.getJSONArray("content"), tL_page));
                            arrayList.add(pageblocktable);
                            break;
                        case 25:
                            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                            pageblockblockquote.text = p(l(jSONObject, tL_page));
                            TL_iv.textItalic textitalic = new TL_iv.textItalic();
                            textitalic.text = pageblockblockquote.text;
                            pageblockblockquote.text = textitalic;
                            arrayList.add(pageblockblockquote);
                            break;
                        case 26:
                            TL_iv.pageBlockDetails pageblockdetails2 = new TL_iv.pageBlockDetails();
                            JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("content");
                            if (jSONArrayOptJSONArray5 == null) {
                                pageblockdetails = null;
                            } else {
                                for (int i15 = 0; i15 < jSONArrayOptJSONArray5.length(); i15++) {
                                    Object obj5 = jSONArrayOptJSONArray5.get(i15);
                                    if (obj5 instanceof JSONObject) {
                                        JSONObject jSONObject5 = (JSONObject) obj5;
                                        if ("summary".equals(jSONObject5.optString("tag"))) {
                                            pageblockdetails2.title = p(l(jSONObject5, tL_page));
                                            jSONArrayOptJSONArray5.remove(i15);
                                            pageblockdetails2.blocks.addAll(j(jSONArrayOptJSONArray5, tL_page));
                                            pageblockdetails2.open = jSONObject.has("open");
                                            pageblockdetails = pageblockdetails2;
                                        }
                                    }
                                }
                                pageblockdetails2.blocks.addAll(j(jSONArrayOptJSONArray5, tL_page));
                                pageblockdetails2.open = jSONObject.has("open");
                                pageblockdetails = pageblockdetails2;
                            }
                            if (pageblockdetails != null) {
                                arrayList.add(pageblockdetails);
                            }
                            break;
                        default:
                            if (jSONArrayOptJSONArray != null) {
                                arrayList.addAll(j(jSONArrayOptJSONArray, tL_page));
                            }
                            break;
                    }
                }
            }
        }
        return arrayList;
    }

    public final TL_iv.RichText k(JSONArray jSONArray, TL_iv.TL_page tL_page) throws JSONException {
        byte b10;
        TL_iv.textUrl texturl;
        TL_iv.textEmail textemail;
        TL_iv.textPhone textphone;
        TL_iv.RichText richTextL;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof String) {
                arrayList.add(m((String) obj));
            } else {
                JSONObject jSONObject = (JSONObject) obj;
                String strOptString = jSONObject.optString("tag");
                strOptString.getClass();
                switch (strOptString) {
                    case "strong":
                        b10 = 0;
                        break;
                    case "a":
                        b10 = 1;
                        break;
                    case "b":
                        b10 = 2;
                        break;
                    case "i":
                        b10 = 3;
                        break;
                    case "p":
                        b10 = 4;
                        break;
                    case "s":
                        b10 = 5;
                        break;
                    case "br":
                        b10 = 6;
                        break;
                    case "img":
                        b10 = 7;
                        break;
                    case "pre":
                        b10 = 8;
                        break;
                    case "sub":
                        b10 = 9;
                        break;
                    case "sup":
                        b10 = 10;
                        break;
                    case "code":
                        b10 = 11;
                        break;
                    case "mark":
                        b10 = 12;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                TL_iv.RichText richTextL2 = null;
                richTextL2 = null;
                richTextL2 = null;
                switch (b10) {
                    case 0:
                    case 2:
                        TL_iv.textBold textbold = new TL_iv.textBold();
                        textbold.text = l(jSONObject, tL_page);
                        richTextL2 = textbold;
                        break;
                    case 1:
                        String strOptString2 = jSONObject.optString("href");
                        if (strOptString2 == null) {
                            richTextL = l(jSONObject, tL_page);
                        } else if (strOptString2.startsWith("tel:")) {
                            textphone = new TL_iv.textPhone();
                            textphone.phone = strOptString2.substring(4);
                            textphone.text = l(jSONObject, tL_page);
                        } else if (strOptString2.startsWith("mailto:")) {
                            textemail = new TL_iv.textEmail();
                            textemail.email = strOptString2.substring(7);
                            textemail.text = l(jSONObject, tL_page);
                        } else {
                            texturl = new TL_iv.textUrl();
                            texturl.url = strOptString2;
                            texturl.text = l(jSONObject, tL_page);
                        }
                        break;
                    case 3:
                        TL_iv.textItalic textitalic = new TL_iv.textItalic();
                        textitalic.text = l(jSONObject, tL_page);
                        richTextL2 = textitalic;
                        break;
                    case 4:
                        if (!arrayList.isEmpty()) {
                            b((TL_iv.RichText) i0.a.i(1, arrayList));
                        }
                        richTextL2 = l(jSONObject, tL_page);
                        break;
                    case 5:
                        TL_iv.textStrike textstrike = new TL_iv.textStrike();
                        textstrike.text = l(jSONObject, tL_page);
                        richTextL2 = textstrike;
                        break;
                    case 6:
                        if (!arrayList.isEmpty()) {
                            b((TL_iv.RichText) i0.a.i(1, arrayList));
                        }
                        break;
                    case 7:
                        if (!arrayList.isEmpty()) {
                            a((TL_iv.RichText) i0.a.i(1, arrayList));
                        }
                        TL_iv.textImage textimage = new TL_iv.textImage();
                        String strOptString3 = jSONObject.optString("src");
                        if (strOptString3 != null) {
                            d2 d2Var = new d2();
                            d2Var.f43812a = this;
                            d2Var.f22404id = (-1) - tL_page.photos.size();
                            d2Var.f43813b = strOptString3;
                            d2Var.f43814c.add(strOptString3);
                            try {
                                d2Var.d = Integer.parseInt(jSONObject.optString("width"));
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                d2Var.f43815e = Integer.parseInt(jSONObject.optString("height"));
                                break;
                            } catch (Exception unused2) {
                            }
                            textimage.url = strOptString3;
                            tL_page.photos.add(d2Var);
                            if (d2Var.d == 0) {
                                d2Var.d = d2Var.f43815e;
                            }
                            if (d2Var.f43815e == 0) {
                                d2Var.f43815e = d2Var.d;
                            }
                            try {
                                textimage.f22604w = Integer.parseInt(jSONObject.optString("width"));
                                break;
                            } catch (Exception unused3) {
                            }
                            try {
                                textimage.h = Integer.parseInt(jSONObject.optString("height"));
                                break;
                            } catch (Exception unused4) {
                            }
                            if (textimage.f22604w == 0) {
                                textimage.f22604w = textimage.h;
                            }
                            if (textimage.h == 0) {
                                textimage.h = textimage.f22604w;
                            }
                            textimage.photo_id = d2Var.f22404id;
                            richTextL2 = textimage;
                        }
                        break;
                    case 8:
                    case 11:
                        TL_iv.textFixed textfixed = new TL_iv.textFixed();
                        textfixed.text = l(jSONObject, tL_page);
                        richTextL2 = textfixed;
                        break;
                    case 9:
                        TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
                        textsubscript.text = l(jSONObject, tL_page);
                        richTextL2 = textsubscript;
                        break;
                    case 10:
                        TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
                        textsuperscript.text = l(jSONObject, tL_page);
                        richTextL2 = textsuperscript;
                        break;
                    case 12:
                        TL_iv.textMarked textmarked = new TL_iv.textMarked();
                        textmarked.text = l(jSONObject, tL_page);
                        richTextL2 = textmarked;
                        break;
                    default:
                        richTextL2 = l(jSONObject, tL_page);
                        break;
                }
                if (richTextL2 != null) {
                    richTextL2 = texturl;
                    richTextL2 = textemail;
                    richTextL2 = textphone;
                    richTextL2 = richTextL;
                    arrayList.add(c(richTextL2, jSONObject));
                } else {
                    richTextL2 = texturl;
                    richTextL2 = textemail;
                    richTextL2 = textphone;
                    richTextL2 = richTextL;
                }
            }
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

    public final TL_iv.RichText l(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.RichText richTextC = c(k(jSONObject.getJSONArray("content"), tL_page), jSONObject);
        if (jSONObject.has("bold")) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = richTextC;
            richTextC = textbold;
        }
        if (!jSONObject.has("italic")) {
            return richTextC;
        }
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = richTextC;
        return textitalic;
    }

    public final ArrayList n(JSONArray jSONArray, TL_iv.TL_page tL_page) throws JSONException {
        JSONObject jSONObject;
        String strOptString;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if ("tr".equals(jSONObject2.optString("tag"))) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("content");
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        Object obj2 = jSONArray2.get(i11);
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
                            pagetablecell.text = p(k(jSONObject.getJSONArray("content"), tL_page));
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
                        arrayList.addAll(n(jSONArrayOptJSONArray, tL_page));
                    }
                }
            }
        }
        return arrayList;
    }
}
