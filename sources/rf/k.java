package rf;

import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.xh0;
public abstract class k {
    public static SpannableStringBuilder a(String str) {
        Spanned fromHtml;
        boolean z10;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml("<inject>" + str + "</inject>", 63, null, new i(new oa.d(19)));
            } else {
                fromHtml = Html.fromHtml("<inject>" + str + "</inject>", null, new i(new oa.d(19)));
            }
            if (fromHtml == null) {
                return null;
            }
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            ArrayList arrayList = new ArrayList(spans.length);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : spans) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if ((style & 1) > 0) {
                        TLRPC.TL_messageEntityBold tL_messageEntityBold = new TLRPC.TL_messageEntityBold();
                        tL_messageEntityBold.offset = spanStart;
                        tL_messageEntityBold.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntityBold);
                    }
                    if ((style & 2) > 0) {
                        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
                        tL_messageEntityItalic.offset = spanStart;
                        tL_messageEntityItalic.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntityItalic);
                    }
                } else if (obj instanceof UnderlineSpan) {
                    TLRPC.TL_messageEntityUnderline tL_messageEntityUnderline = new TLRPC.TL_messageEntityUnderline();
                    tL_messageEntityUnderline.offset = spanStart;
                    tL_messageEntityUnderline.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityUnderline);
                } else if (obj instanceof StrikethroughSpan) {
                    TLRPC.TL_messageEntityStrike tL_messageEntityStrike = new TLRPC.TL_messageEntityStrike();
                    tL_messageEntityStrike.offset = spanStart;
                    tL_messageEntityStrike.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityStrike);
                } else if (obj instanceof j) {
                    j jVar = (j) obj;
                    int i10 = jVar.f46553a;
                    if (i10 == 0) {
                        TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                        tL_messageEntitySpoiler.offset = spanStart;
                        tL_messageEntitySpoiler.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntitySpoiler);
                    } else if (i10 == 1) {
                        if (!TextUtils.isEmpty(jVar.f46554b)) {
                            arrayList2.add(jVar);
                        } else {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre.offset = spanStart;
                            tL_messageEntityPre.length = spanEnd - spanStart;
                            arrayList.add(tL_messageEntityPre);
                        }
                    } else if (i10 == 2 || i10 == 3) {
                        arrayList3.add(jVar);
                    }
                } else if (obj instanceof o5) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    o5 o5Var = (o5) obj;
                    tL_messageEntityCustomEmoji.document_id = o5Var.documentId;
                    tL_messageEntityCustomEmoji.document = o5Var.document;
                    tL_messageEntityCustomEmoji.offset = spanStart;
                    tL_messageEntityCustomEmoji.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityCustomEmoji);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml.toString());
            vi.g(arrayList, spannableStringBuilder, spannableStringBuilder, -1);
            for (Object obj2 : spans) {
                if (obj2 instanceof URLSpan) {
                    int spanStart2 = fromHtml.getSpanStart(obj2);
                    int spanEnd2 = fromHtml.getSpanEnd(obj2);
                    String charSequence = fromHtml.subSequence(spanStart2, spanEnd2).toString();
                    String url = ((URLSpan) obj2).getURL();
                    if (charSequence.equals(url)) {
                        spannableStringBuilder.setSpan(new URLSpan(url), spanStart2, spanEnd2, 33);
                    } else {
                        spannableStringBuilder.setSpan(new h51(url, null), spanStart2, spanEnd2, 33);
                    }
                }
            }
            vi.a(null, spannableStringBuilder, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                j jVar2 = (j) arrayList2.get(i11);
                int spanStart3 = fromHtml.getSpanStart(jVar2);
                int spanEnd3 = fromHtml.getSpanEnd(jVar2);
                spannableStringBuilder.setSpan(new di.i(jVar2.f46554b, spannableStringBuilder.subSequence(spanStart3, spanEnd3).toString(), true), spanStart3, spanEnd3, 33);
            }
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                j jVar3 = (j) arrayList3.get(i12);
                int spanStart4 = fromHtml.getSpanStart(jVar3);
                int spanEnd4 = fromHtml.getSpanEnd(jVar3);
                if (jVar3.f46553a == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xh0.c(spannableStringBuilder, spanStart4, spanEnd4, z10);
            }
            return spannableStringBuilder;
        } catch (Exception e) {
            f8.e("Html.fromHtml", e);
            return null;
        }
    }
}
