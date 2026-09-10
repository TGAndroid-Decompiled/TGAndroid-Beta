package xf;

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
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.y5;
public abstract class l {
    public static SpannableStringBuilder a(String str) {
        Spanned fromHtml;
        boolean z10;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml("<inject>" + str + "</inject>", 63, null, new j(new qb.b(26)));
            } else {
                fromHtml = Html.fromHtml("<inject>" + str + "</inject>", null, new j(new qb.b(26)));
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
                } else if (obj instanceof k) {
                    k kVar = (k) obj;
                    int i10 = kVar.f45154a;
                    if (i10 == 0) {
                        TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                        tL_messageEntitySpoiler.offset = spanStart;
                        tL_messageEntitySpoiler.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntitySpoiler);
                    } else if (i10 == 1) {
                        if (!TextUtils.isEmpty(kVar.f45155b)) {
                            arrayList2.add(kVar);
                        } else {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre.offset = spanStart;
                            tL_messageEntityPre.length = spanEnd - spanStart;
                            arrayList.add(tL_messageEntityPre);
                        }
                    } else if (i10 == 2 || i10 == 3) {
                        arrayList3.add(kVar);
                    }
                } else if (obj instanceof y5) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    y5 y5Var = (y5) obj;
                    tL_messageEntityCustomEmoji.document_id = y5Var.documentId;
                    tL_messageEntityCustomEmoji.document = y5Var.document;
                    tL_messageEntityCustomEmoji.offset = spanStart;
                    tL_messageEntityCustomEmoji.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityCustomEmoji);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml.toString());
            MediaDataController.addTextStyleRuns(arrayList, spannableStringBuilder, spannableStringBuilder);
            for (Object obj2 : spans) {
                if (obj2 instanceof URLSpan) {
                    int spanStart2 = fromHtml.getSpanStart(obj2);
                    int spanEnd2 = fromHtml.getSpanEnd(obj2);
                    String charSequence = fromHtml.subSequence(spanStart2, spanEnd2).toString();
                    String url = ((URLSpan) obj2).getURL();
                    if (charSequence.equals(url)) {
                        spannableStringBuilder.setSpan(new URLSpan(url), spanStart2, spanEnd2, 33);
                    } else {
                        spannableStringBuilder.setSpan(new b61(url, null), spanStart2, spanEnd2, 33);
                    }
                }
            }
            MediaDataController.addAnimatedEmojiSpans(arrayList, spannableStringBuilder, null);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                k kVar2 = (k) arrayList2.get(i11);
                int spanStart3 = fromHtml.getSpanStart(kVar2);
                int spanEnd3 = fromHtml.getSpanEnd(kVar2);
                spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, kVar2.f45155b, spannableStringBuilder.subSequence(spanStart3, spanEnd3).toString()), spanStart3, spanEnd3, 33);
            }
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                k kVar3 = (k) arrayList3.get(i12);
                int spanStart4 = fromHtml.getSpanStart(kVar3);
                int spanEnd4 = fromHtml.getSpanEnd(kVar3);
                if (kVar3.f45154a == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cj0.c(spannableStringBuilder, spanStart4, spanEnd4, z10);
            }
            return spannableStringBuilder;
        } catch (Exception e) {
            FileLog.e("Html.fromHtml", e);
            return null;
        }
    }
}
