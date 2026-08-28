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
import mh.m2;
import org.json.JSONArray;
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
import org.telegram.ui.eb0;
public final class d2 {
    public static final HashMap f43835e = new HashMap();
    public static HashMap f43836f;
    public String f43837a;
    public com.google.firebase.messaging.t f43838b;
    public TLRPC.TL_webPage f43839c;
    public final HashMap d = new HashMap();

    public static void a(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText != null) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                a(richText2);
            } else if (!richText.texts.isEmpty()) {
                a((TL_iv.RichText) j3.r0.j(1, richText.texts));
            } else if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null && !str.endsWith(" ")) {
                textplain.text += ' ';
            }
        }
    }

    public static void b(TL_iv.RichText richText) {
        if (richText != null) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                b(richText2);
            } else if (!richText.texts.isEmpty()) {
                b((TL_iv.RichText) j3.r0.j(1, richText.texts));
            } else if (richText instanceof TL_iv.textPlain) {
                StringBuilder sb2 = new StringBuilder();
                TL_iv.textPlain textplain = (TL_iv.textPlain) richText;
                sb2.append(textplain.text);
                sb2.append('\n');
                textplain.text = sb2.toString();
            }
        }
    }

    public static TL_iv.RichText c(TL_iv.RichText richText, JSONObject jSONObject) {
        String optString = jSONObject.optString("id");
        if (TextUtils.isEmpty(optString)) {
            return richText;
        }
        TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
        textanchor.text = richText;
        textanchor.name = optString;
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
            for (int i9 = 0; i9 < textconcat.texts.size(); i9++) {
                TL_iv.RichText d = d(textconcat.texts.get(i9), str, str2);
                if (d != null) {
                    textconcat2.texts.add(d);
                }
            }
            return textconcat2;
        } else if ((richText instanceof TL_iv.textUrl) && (str3 = (texturl = (TL_iv.textUrl) richText).url) != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.equals("#" + str2)) {
                String lowerCase2 = texturl.url.toLowerCase();
                if (!TextUtils.equals(lowerCase2, str + "#" + str2)) {
                    return richText;
                }
            }
            return null;
        } else {
            return richText;
        }
    }

    public static m2 e(v0 v0Var, Utilities.Callback callback) {
        if (v0Var == null) {
            callback.run(null);
            return null;
        }
        boolean[] zArr = {false};
        d2 d2Var = new d2();
        d2Var.f43837a = v0Var.getUrl();
        Timer create = Timer.create("WebInstantView");
        v1 v1Var = new v1(Timer.start(create, "getHTML"), zArr, create, d2Var, callback, 0);
        System.currentTimeMillis();
        v0Var.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "true"), new w1(d2Var, v0Var, new File(AndroidUtilities.getCacheDir(), "archive.mht"), v1Var, 0));
        return new m2(zArr, 22);
    }

    public static boolean f(JSONArray jSONArray) {
        List asList = Arrays.asList("b", "strong", "span", "img", "i", "s", "a", "code", "mark", "sub", "sup");
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            Object obj = jSONArray.get(i9);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String optString = jSONObject.optString("tag");
                    if (!asList.contains(optString)) {
                        if ("div".equalsIgnoreCase(optString) || "span".equalsIgnoreCase(optString)) {
                            f(jSONObject.optJSONArray("content"));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static void g(c2 c2Var, ImageReceiver imageReceiver, Runnable runnable) {
        d2 d2Var;
        g1 g1Var;
        String str;
        Bitmap decodeStream;
        if (c2Var != null && (d2Var = c2Var.f43825a) != null) {
            HashMap hashMap = d2Var.d;
            try {
                if (d2Var.f43838b != null) {
                    Iterator it = c2Var.f43827c.iterator();
                    g1Var = null;
                    while (it.hasNext()) {
                        g1Var = (g1) ((HashMap) d2Var.f43838b.d).get((String) it.next());
                        if (g1Var != null) {
                            break;
                        }
                    }
                } else {
                    g1Var = null;
                }
                if (g1Var != null) {
                    h1 h1Var = (h1) g1Var.f43861a.get("content-type");
                    if (h1Var == null) {
                        str = null;
                    } else {
                        str = h1Var.f43877a;
                    }
                    if (str.contains("svg")) {
                        if (c2Var.d > 0 && c2Var.f43828e > 0) {
                            decodeStream = SvgHelper.getBitmap((InputStream) g1Var.a(), AndroidUtilities.dp(c2Var.d), AndroidUtilities.dp(c2Var.f43828e), false);
                        }
                        return;
                    }
                    if (c2Var.d <= 0 || c2Var.f43828e <= 0) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(g1Var.a(), null, options);
                        int i9 = c2Var.d;
                        if (i9 == 0 && c2Var.f43828e == 0) {
                            c2Var.d = options.outWidth;
                            c2Var.f43828e = options.outHeight;
                        } else if (i9 == 0) {
                            c2Var.d = (int) ((options.outWidth / options.outHeight) * c2Var.f43828e);
                        } else if (c2Var.f43828e == 0) {
                            c2Var.f43828e = (int) ((options.outHeight / options.outWidth) * i9);
                        }
                        runnable.run();
                    }
                    decodeStream = BitmapFactory.decodeStream(g1Var.a());
                    imageReceiver.setImageBitmap(decodeStream);
                } else if (hashMap.containsKey(c2Var.f43826b)) {
                    imageReceiver.setImageBitmap((Bitmap) hashMap.get(c2Var.f43826b));
                } else {
                    if (f43836f == null) {
                        f43836f = new HashMap();
                    }
                    ArrayList arrayList = (ArrayList) f43836f.get(c2Var.f43826b);
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((Pair) arrayList.get(i10)).first == imageReceiver) {
                                return;
                            }
                        }
                        arrayList.add(new Pair(imageReceiver, runnable));
                        return;
                    }
                    f43836f.put(c2Var.f43826b, new ArrayList());
                    new d1(new eb0(16, d2Var, c2Var)).execute(c2Var.f43826b);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
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
        HashMap hashMap = f43835e;
        d2 d2Var = (d2) hashMap.remove(webPage);
        if (d2Var != null) {
            hashMap.remove(d2Var.f43839c);
            HashMap hashMap2 = d2Var.d;
            for (Map.Entry entry : hashMap2.entrySet()) {
                AndroidUtilities.recycleBitmap((Bitmap) entry.getValue());
            }
            hashMap2.clear();
            TLRPC.TL_webPage tL_webPage = d2Var.f43839c;
            if (tL_webPage != null && (page = tL_webPage.cached_page) != null && (arrayList = page.photos) != null) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    TLRPC.Photo photo = arrayList.get(i9);
                    i9++;
                    TLRPC.Photo photo2 = photo;
                    if (photo2 instanceof c2) {
                        c2 c2Var = (c2) photo2;
                        HashMap hashMap3 = f43836f;
                        if (hashMap3 != null) {
                            hashMap3.remove(c2Var.f43826b);
                        }
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
        } else if (richText.texts.size() == 1) {
            p(richText.texts.get(0));
            return richText;
        } else if (!richText.texts.isEmpty()) {
            r(richText.texts.get(0));
            q((TL_iv.RichText) j3.r0.j(1, richText.texts));
            return richText;
        } else {
            if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
                textplain.text = str.trim();
            }
            return richText;
        }
    }

    public static void q(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText != null) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                q(richText2);
            } else if (!richText.texts.isEmpty()) {
                q((TL_iv.RichText) j3.r0.j(1, richText.texts));
            } else if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
                textplain.text = str.replaceAll("\\s+$", "");
            }
        }
    }

    public static void r(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText != null) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                r(richText2);
            } else if (!richText.texts.isEmpty()) {
                r(richText.texts.get(0));
            } else if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
                textplain.text = str.replaceAll("^\\s+", "");
            }
        }
    }

    public final TL_iv.pageBlockPhoto h(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        pageblockphoto.caption = new TL_iv.PageCaption();
        String optString = jSONObject.optString("alt");
        if (optString != null) {
            pageblockphoto.caption.text = p(m(optString));
            pageblockphoto.caption.credit = p(m(""));
        }
        String optString2 = jSONObject.optString("src");
        if (optString2 == null) {
            return null;
        }
        c2 c2Var = new c2();
        c2Var.f43825a = this;
        c2Var.f22404id = (-1) - tL_page.photos.size();
        c2Var.f43826b = optString2;
        c2Var.f43827c.add(optString2);
        try {
            c2Var.d = Integer.parseInt(jSONObject.optString("width"));
        } catch (Exception unused) {
        }
        try {
            c2Var.f43828e = Integer.parseInt(jSONObject.optString("height"));
        } catch (Exception unused2) {
        }
        if (c2Var.d == 0) {
            c2Var.d = c2Var.f43828e;
        }
        if (c2Var.f43828e == 0) {
            c2Var.f43828e = c2Var.d;
        }
        pageblockphoto.photo_id = c2Var.f22404id;
        pageblockphoto.url = optString2;
        tL_page.photos.add(c2Var);
        return pageblockphoto;
    }

    public final TLRPC.TL_webPage i(String str, JSONObject jSONObject) {
        TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
        tL_webPage.f22533id = 0L;
        tL_webPage.url = str;
        tL_webPage.display_url = str;
        String string = jSONObject.getString("siteName");
        if (string != null && !"null".equals(string)) {
            tL_webPage.flags |= 2;
            tL_webPage.site_name = string;
        }
        String optString = jSONObject.optString("title");
        if (optString != null && !"null".equals(optString)) {
            tL_webPage.flags |= 4;
            tL_webPage.title = optString;
        }
        String optString2 = jSONObject.optString("byline");
        if (optString2 != null && !"null".equals(optString2) && !"by".equalsIgnoreCase(optString2)) {
            tL_webPage.flags |= 256;
            tL_webPage.author = optString2;
        }
        String optString3 = jSONObject.optString("excerpt");
        if (optString3 != null && !"null".equals(optString3)) {
            tL_webPage.flags |= 8;
            tL_webPage.description = optString3;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("content");
        if (optJSONArray != null && !"null".equals(optJSONArray)) {
            tL_webPage.flags |= 1024;
            String optString4 = jSONObject.optString("title");
            if ("null".equals(optString4)) {
                optString4 = null;
            }
            "null".equals(jSONObject.optString("publishedTime"));
            JSONArray optJSONArray2 = jSONObject.optJSONArray("content");
            TL_iv.TL_page tL_page = new TL_iv.TL_page();
            tL_page.web = true;
            tL_page.url = str;
            tL_page.blocks.addAll(j(optJSONArray2, tL_page));
            if (tL_page.blocks.isEmpty() || !(tL_page.blocks.get(0) instanceof TL_iv.pageBlockHeader)) {
                TL_iv.pageBlockTitle pageblocktitle = new TL_iv.pageBlockTitle();
                pageblocktitle.text = p(m(optString4));
                tL_page.blocks.add(0, pageblocktitle);
            }
            tL_webPage.cached_page = tL_page;
        }
        return tL_webPage;
    }

    public final ArrayList j(JSONArray jSONArray, TL_iv.TL_page tL_page) {
        c2 c2Var;
        TL_iv.pageBlockPhoto pageblockphoto;
        ?? pageblocklist;
        TL_iv.pageBlockDetails pageblockdetails;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            Object obj = jSONArray.get(i9);
            if (obj instanceof String) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = m((String) obj);
                arrayList.add(pageblockparagraph);
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("tag");
                JSONArray optJSONArray = jSONObject.optJSONArray("content");
                optString.getClass();
                char c10 = 65535;
                switch (optString.hashCode()) {
                    case -1274639644:
                        if (optString.equals("figure")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -891980137:
                        if (optString.equals("strong")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -577741570:
                        if (optString.equals("picture")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 97:
                        if (optString.equals("a")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 98:
                        if (optString.equals("b")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 105:
                        if (optString.equals("i")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 112:
                        if (optString.equals("p")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 115:
                        if (optString.equals("s")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 3273:
                        if (optString.equals("h1")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 3274:
                        if (optString.equals("h2")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 3275:
                        if (optString.equals("h3")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 3276:
                        if (optString.equals("h4")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 3277:
                        if (optString.equals("h5")) {
                            c10 = '\f';
                            break;
                        }
                        break;
                    case 3278:
                        if (optString.equals("h6")) {
                            c10 = '\r';
                            break;
                        }
                        break;
                    case 3338:
                        if (optString.equals("hr")) {
                            c10 = 14;
                            break;
                        }
                        break;
                    case 3549:
                        if (optString.equals("ol")) {
                            c10 = 15;
                            break;
                        }
                        break;
                    case 3735:
                        if (optString.equals("ul")) {
                            c10 = 16;
                            break;
                        }
                        break;
                    case 104387:
                        if (optString.equals("img")) {
                            c10 = 17;
                            break;
                        }
                        break;
                    case 111267:
                        if (optString.equals("pre")) {
                            c10 = 18;
                            break;
                        }
                        break;
                    case 114240:
                        if (optString.equals("sub")) {
                            c10 = 19;
                            break;
                        }
                        break;
                    case 114254:
                        if (optString.equals("sup")) {
                            c10 = 20;
                            break;
                        }
                        break;
                    case 3059181:
                        if (optString.equals("code")) {
                            c10 = 21;
                            break;
                        }
                        break;
                    case 3344077:
                        if (optString.equals("mark")) {
                            c10 = 22;
                            break;
                        }
                        break;
                    case 3536714:
                        if (optString.equals("span")) {
                            c10 = 23;
                            break;
                        }
                        break;
                    case 110115790:
                        if (optString.equals("table")) {
                            c10 = 24;
                            break;
                        }
                        break;
                    case 1303202319:
                        if (optString.equals("blockquote")) {
                            c10 = 25;
                            break;
                        }
                        break;
                    case 1557721666:
                        if (optString.equals("details")) {
                            c10 = 26;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                    case 2:
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("content");
                        ArrayList arrayList2 = new ArrayList();
                        TL_iv.pageBlockPhoto pageblockphoto2 = null;
                        TL_iv.RichText richText = null;
                        for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                            Object obj2 = optJSONArray2.get(i10);
                            if (obj2 instanceof JSONObject) {
                                JSONObject jSONObject2 = (JSONObject) obj2;
                                String optString2 = jSONObject2.optString("tag");
                                if (!"figurecaption".equalsIgnoreCase(optString2) && !"caption".equalsIgnoreCase(optString2)) {
                                    if ("img".equalsIgnoreCase(optString2)) {
                                        pageblockphoto2 = h(jSONObject2, tL_page);
                                    } else if ("source".equalsIgnoreCase(optString2)) {
                                        String optString3 = jSONObject2.optString("src");
                                        if (!TextUtils.isEmpty(optString3)) {
                                            arrayList2.add(optString3);
                                        } else {
                                            String optString4 = jSONObject2.optString("srcset");
                                            if (!TextUtils.isEmpty(optString4)) {
                                                for (String str : optString4.split(",")) {
                                                    arrayList2.add(str.trim().split(" ")[0].trim());
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    richText = p(l(jSONObject2, tL_page));
                                }
                            }
                        }
                        if (pageblockphoto2 == null) {
                            pageblockphoto = null;
                        } else {
                            if (richText != null) {
                                TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                                pageblockphoto2.caption = pageCaption;
                                pageCaption.text = richText;
                                pageCaption.credit = new TL_iv.textEmpty();
                            }
                            int i11 = 0;
                            while (true) {
                                if (i11 >= tL_page.photos.size()) {
                                    c2Var = null;
                                } else if ((tL_page.photos.get(i11) instanceof c2) && tL_page.photos.get(i11).f22404id == pageblockphoto2.photo_id) {
                                    c2Var = (c2) tL_page.photos.get(i11);
                                } else {
                                    i11++;
                                }
                            }
                            if (c2Var != null) {
                                c2Var.f43827c.addAll(arrayList2);
                            }
                            pageblockphoto = pageblockphoto2;
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
                    case '\b':
                        TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                        pageblockheading1.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading1);
                        break;
                    case '\t':
                        TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                        pageblockheading2.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading2);
                        break;
                    case '\n':
                        TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                        pageblockheading3.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading3);
                        break;
                    case 11:
                        TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                        pageblockheading4.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading4);
                        break;
                    case '\f':
                        TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                        pageblockheading5.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading5);
                        break;
                    case '\r':
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
                            for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                                Object obj3 = jSONArray3.get(i12);
                                if (obj3 instanceof JSONObject) {
                                    JSONObject jSONObject3 = (JSONObject) obj3;
                                    if ("li".equals(jSONObject3.optString("tag"))) {
                                        JSONArray optJSONArray3 = jSONObject3.optJSONArray("content");
                                        if (f(optJSONArray3)) {
                                            TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                                            tL_pageListOrderedItemText.text = k(optJSONArray3, tL_page);
                                            pageblocklist.items.add(tL_pageListOrderedItemText);
                                        } else {
                                            TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                                            tL_pageListOrderedItemBlocks.blocks.addAll(j(optJSONArray3, tL_page));
                                            pageblocklist.items.add(tL_pageListOrderedItemBlocks);
                                        }
                                    }
                                }
                            }
                        } else {
                            pageblocklist = new TL_iv.pageBlockList();
                            JSONArray jSONArray4 = jSONObject.getJSONArray("content");
                            for (int i13 = 0; i13 < jSONArray4.length(); i13++) {
                                Object obj4 = jSONArray4.get(i13);
                                if (obj4 instanceof JSONObject) {
                                    JSONObject jSONObject4 = (JSONObject) obj4;
                                    if ("li".equals(jSONObject4.optString("tag"))) {
                                        JSONArray optJSONArray4 = jSONObject4.optJSONArray("content");
                                        if (f(optJSONArray4)) {
                                            TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                                            tL_pageListItemText.text = k(optJSONArray4, tL_page);
                                            pageblocklist.items.add(tL_pageListItemText);
                                        } else {
                                            TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                                            tL_pageListItemBlocks.blocks.addAll(j(optJSONArray4, tL_page));
                                            pageblocklist.items.add(tL_pageListItemBlocks);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList.add(pageblocklist);
                        break;
                    case 17:
                        TL_iv.pageBlockPhoto h = h(jSONObject, tL_page);
                        if (h != null) {
                            arrayList.add(h);
                            break;
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
                        String optString5 = jSONObject.optString("title");
                        pageblocktable.title = p(c(m(optString5 != null ? optString5 : ""), jSONObject));
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
                        JSONArray optJSONArray5 = jSONObject.optJSONArray("content");
                        if (optJSONArray5 == null) {
                            pageblockdetails = null;
                        } else {
                            int i14 = 0;
                            while (true) {
                                if (i14 < optJSONArray5.length()) {
                                    Object obj5 = optJSONArray5.get(i14);
                                    if (obj5 instanceof JSONObject) {
                                        JSONObject jSONObject5 = (JSONObject) obj5;
                                        if ("summary".equals(jSONObject5.optString("tag"))) {
                                            pageblockdetails2.title = p(l(jSONObject5, tL_page));
                                            optJSONArray5.remove(i14);
                                        }
                                    }
                                    i14++;
                                }
                            }
                            pageblockdetails2.blocks.addAll(j(optJSONArray5, tL_page));
                            pageblockdetails2.open = jSONObject.has("open");
                            pageblockdetails = pageblockdetails2;
                        }
                        if (pageblockdetails != null) {
                            arrayList.add(pageblockdetails);
                            break;
                        }
                        break;
                    default:
                        if (optJSONArray != null) {
                            arrayList.addAll(j(optJSONArray, tL_page));
                            break;
                        }
                        break;
                }
            }
        }
        return arrayList;
    }

    public final TL_iv.RichText k(JSONArray jSONArray, TL_iv.TL_page tL_page) {
        char c10;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            Object obj = jSONArray.get(i9);
            if (obj instanceof String) {
                arrayList.add(m((String) obj));
            } else {
                JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("tag");
                optString.getClass();
                switch (optString.hashCode()) {
                    case -891980137:
                        if (optString.equals("strong")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 97:
                        if (optString.equals("a")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 98:
                        if (optString.equals("b")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 105:
                        if (optString.equals("i")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 112:
                        if (optString.equals("p")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 115:
                        if (optString.equals("s")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3152:
                        if (optString.equals("br")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 104387:
                        if (optString.equals("img")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 111267:
                        if (optString.equals("pre")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 114240:
                        if (optString.equals("sub")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 114254:
                        if (optString.equals("sup")) {
                            c10 = '\n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3059181:
                        if (optString.equals("code")) {
                            c10 = 11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3344077:
                        if (optString.equals("mark")) {
                            c10 = '\f';
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                TL_iv.textMarked textmarked = null;
                textmarked = null;
                textmarked = null;
                switch (c10) {
                    case 0:
                    case 2:
                        TL_iv.textBold textbold = new TL_iv.textBold();
                        textbold.text = l(jSONObject, tL_page);
                        textmarked = textbold;
                        break;
                    case 1:
                        String optString2 = jSONObject.optString("href");
                        if (optString2 == null) {
                            textmarked = l(jSONObject, tL_page);
                            break;
                        } else if (optString2.startsWith("tel:")) {
                            TL_iv.textPhone textphone = new TL_iv.textPhone();
                            textphone.phone = optString2.substring(4);
                            textphone.text = l(jSONObject, tL_page);
                            textmarked = textphone;
                            break;
                        } else if (optString2.startsWith("mailto:")) {
                            TL_iv.textEmail textemail = new TL_iv.textEmail();
                            textemail.email = optString2.substring(7);
                            textemail.text = l(jSONObject, tL_page);
                            textmarked = textemail;
                            break;
                        } else {
                            TL_iv.textUrl texturl = new TL_iv.textUrl();
                            texturl.url = optString2;
                            texturl.text = l(jSONObject, tL_page);
                            textmarked = texturl;
                            break;
                        }
                    case 3:
                        TL_iv.textItalic textitalic = new TL_iv.textItalic();
                        textitalic.text = l(jSONObject, tL_page);
                        textmarked = textitalic;
                        break;
                    case 4:
                        if (!arrayList.isEmpty()) {
                            b((TL_iv.RichText) j3.r0.j(1, arrayList));
                        }
                        textmarked = l(jSONObject, tL_page);
                        break;
                    case 5:
                        TL_iv.textStrike textstrike = new TL_iv.textStrike();
                        textstrike.text = l(jSONObject, tL_page);
                        textmarked = textstrike;
                        break;
                    case 6:
                        if (!arrayList.isEmpty()) {
                            b((TL_iv.RichText) j3.r0.j(1, arrayList));
                            break;
                        }
                        break;
                    case 7:
                        if (!arrayList.isEmpty()) {
                            a((TL_iv.RichText) j3.r0.j(1, arrayList));
                        }
                        TL_iv.textImage textimage = new TL_iv.textImage();
                        String optString3 = jSONObject.optString("src");
                        if (optString3 != null) {
                            c2 c2Var = new c2();
                            c2Var.f43825a = this;
                            c2Var.f22404id = (-1) - tL_page.photos.size();
                            c2Var.f43826b = optString3;
                            c2Var.f43827c.add(optString3);
                            try {
                                c2Var.d = Integer.parseInt(jSONObject.optString("width"));
                            } catch (Exception unused) {
                            }
                            try {
                                c2Var.f43828e = Integer.parseInt(jSONObject.optString("height"));
                            } catch (Exception unused2) {
                            }
                            textimage.url = optString3;
                            tL_page.photos.add(c2Var);
                            if (c2Var.d == 0) {
                                c2Var.d = c2Var.f43828e;
                            }
                            if (c2Var.f43828e == 0) {
                                c2Var.f43828e = c2Var.d;
                            }
                            try {
                                textimage.f22604w = Integer.parseInt(jSONObject.optString("width"));
                            } catch (Exception unused3) {
                            }
                            try {
                                textimage.h = Integer.parseInt(jSONObject.optString("height"));
                            } catch (Exception unused4) {
                            }
                            if (textimage.f22604w == 0) {
                                textimage.f22604w = textimage.h;
                            }
                            if (textimage.h == 0) {
                                textimage.h = textimage.f22604w;
                            }
                            textimage.photo_id = c2Var.f22404id;
                            textmarked = textimage;
                            break;
                        }
                        break;
                    case '\b':
                    case 11:
                        TL_iv.textFixed textfixed = new TL_iv.textFixed();
                        textfixed.text = l(jSONObject, tL_page);
                        textmarked = textfixed;
                        break;
                    case '\t':
                        TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
                        textsubscript.text = l(jSONObject, tL_page);
                        textmarked = textsubscript;
                        break;
                    case '\n':
                        TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
                        textsuperscript.text = l(jSONObject, tL_page);
                        textmarked = textsuperscript;
                        break;
                    case '\f':
                        TL_iv.textMarked textmarked2 = new TL_iv.textMarked();
                        textmarked2.text = l(jSONObject, tL_page);
                        textmarked = textmarked2;
                        break;
                    default:
                        textmarked = l(jSONObject, tL_page);
                        break;
                }
                if (textmarked != null) {
                    arrayList.add(c(textmarked, jSONObject));
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
        TL_iv.RichText c10 = c(k(jSONObject.getJSONArray("content"), tL_page), jSONObject);
        if (jSONObject.has("bold")) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = c10;
            c10 = textbold;
        }
        if (jSONObject.has("italic")) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = c10;
            return textitalic;
        }
        return c10;
    }

    public final ArrayList n(JSONArray jSONArray, TL_iv.TL_page tL_page) {
        JSONObject jSONObject;
        String optString;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            Object obj = jSONArray.get(i9);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if ("tr".equals(jSONObject2.optString("tag"))) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("content");
                    for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                        Object obj2 = jSONArray2.get(i10);
                        if ((obj2 instanceof JSONObject) && (optString = (jSONObject = (JSONObject) obj2).optString("tag")) != null && ("td".equals(optString) || "th".equals(optString))) {
                            TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                            pagetablecell.header = "th".equals(optString);
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
                    JSONArray optJSONArray = jSONObject2.optJSONArray("content");
                    if (optJSONArray != null) {
                        arrayList.addAll(n(optJSONArray, tL_page));
                    }
                }
            }
        }
        return arrayList;
    }
}
