package th;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.qi0;
public abstract class u4 {
    public static Object a(Spanned spanned, int i10, int i11, Class cls) {
        Object[] spans;
        for (Object obj : spanned.getSpans(i10, Math.max(i10, i11), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i10 && spanEnd >= i11) {
                return obj;
            }
        }
        return null;
    }

    public static ArrayList b(CharSequence charSequence) {
        Spanned spanned;
        int i10;
        CodeHighlighting.Span span;
        qi0 qi0Var;
        qi0 qi0Var2;
        int i11;
        boolean z10;
        Object a2;
        ArrayList arrayList = new ArrayList();
        if (charSequence == null) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph);
            return arrayList;
        }
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
        } else {
            spanned = null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0);
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            if (charSequence.charAt(i12) == '\n') {
                arrayList2.add(Integer.valueOf(i12 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        int length = charSequence.length();
        int i14 = 0;
        while (i14 < size) {
            int i15 = iArr[i14];
            i14++;
            if (i14 < size) {
                i10 = iArr[i14] - 1;
            } else {
                i10 = length;
            }
            if (spanned == null) {
                span = null;
            } else {
                span = (CodeHighlighting.Span) a(spanned, i15, i10, CodeHighlighting.Span.class);
            }
            if (spanned != null && span == null) {
                qi0Var = (qi0) a(spanned, i15, i10, qi0.class);
            } else {
                qi0Var = null;
            }
            if (span == null && qi0Var == null) {
                CharSequence subSequence = charSequence.subSequence(i15, i10);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = v5.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                if (span != null) {
                    qi0Var2 = span;
                } else {
                    qi0Var2 = qi0Var;
                }
                while (true) {
                    if (i14 < size) {
                        int i16 = iArr[i14];
                        int i17 = i14 + 1;
                        if (i17 < size) {
                            i11 = length;
                            length = iArr[i17] - 1;
                        } else {
                            i11 = length;
                        }
                        if (span != null) {
                            a2 = a(spanned, i16, length, CodeHighlighting.Span.class);
                        } else {
                            a2 = a(spanned, i16, length, qi0.class);
                        }
                        if (a2 != qi0Var2) {
                            break;
                        }
                        i10 = length;
                        i14 = i17;
                        length = i11;
                    } else {
                        i11 = length;
                        break;
                    }
                }
                CharSequence subSequence2 = charSequence.subSequence(i15, i10);
                if (span != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = v5.f(subSequence2);
                    String str = span.lng;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = v5.f(subSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    if (qi0Var != null && qi0Var.f31959e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pageblockblockquote.collapsed = z10;
                    arrayList.add(pageblockblockquote);
                }
                length = i11;
            }
        }
        if (arrayList.isEmpty()) {
            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
            pageblockparagraph3.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph3);
        }
        return arrayList;
    }

    public static SpannableStringBuilder c(List list) {
        ArrayList arrayList = new ArrayList();
        d(arrayList, list);
        return g(arrayList);
    }

    public static void d(ArrayList arrayList, List list) {
        TL_iv.RichText richText;
        SpannableStringBuilder spannableStringBuilder;
        String valueOf;
        SpannableStringBuilder spannableStringBuilder2;
        String str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) it.next();
                SpannableStringBuilder spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                spannableStringBuilder3 = null;
                if (pageBlock != null) {
                    int i10 = 0;
                    if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(v5.r(pageBlock.text, pageBlock, true));
                        spannableStringBuilder4.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) pageBlock).language, spannableStringBuilder4.toString()), 0, spannableStringBuilder4.length(), 33);
                        spannableStringBuilder3 = spannableStringBuilder4;
                    } else {
                        boolean z10 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                        if (!z10 && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                                ArrayList arrayList2 = new ArrayList();
                                d(arrayList2, pageblockblockquoteblocks.blocks);
                                spannableStringBuilder3 = h(g(arrayList2), pageblockblockquoteblocks.caption);
                            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                                ArrayList arrayList3 = new ArrayList();
                                SpannableStringBuilder r6 = v5.r(pageblockdetails.title, null, true);
                                if (!TextUtils.isEmpty(r6)) {
                                    arrayList3.add(r6);
                                }
                                d(arrayList3, pageblockdetails.blocks);
                                if (!arrayList3.isEmpty()) {
                                    spannableStringBuilder3 = g(arrayList3);
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockList) {
                                ArrayList<TL_iv.PageListItem> arrayList4 = ((TL_iv.pageBlockList) pageBlock).items;
                                if (arrayList4 != null && !arrayList4.isEmpty()) {
                                    ArrayList arrayList5 = new ArrayList();
                                    int size = arrayList4.size();
                                    while (i10 < size) {
                                        TL_iv.PageListItem pageListItem = arrayList4.get(i10);
                                        i10++;
                                        TL_iv.PageListItem pageListItem2 = pageListItem;
                                        if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                                            spannableStringBuilder2 = v5.r(((TL_iv.TL_pageListItemText) pageListItem2).text, null, true);
                                        } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                                            spannableStringBuilder2 = c(((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks);
                                        } else {
                                            spannableStringBuilder2 = null;
                                        }
                                        if (spannableStringBuilder2 != null) {
                                            if (pageListItem2.checkbox) {
                                                if (pageListItem2.checked) {
                                                    str = "☑  ";
                                                } else {
                                                    str = "☐  ";
                                                }
                                            } else {
                                                str = "•  ";
                                            }
                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(str);
                                            spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                            arrayList5.add(spannableStringBuilder5);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        spannableStringBuilder3 = g(arrayList5);
                                    }
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                                ArrayList<TL_iv.PageListOrderedItem> arrayList6 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
                                if (arrayList6 != null && !arrayList6.isEmpty()) {
                                    ArrayList arrayList7 = new ArrayList();
                                    int size2 = arrayList6.size();
                                    int i11 = 1;
                                    while (i10 < size2) {
                                        TL_iv.PageListOrderedItem pageListOrderedItem = arrayList6.get(i10);
                                        i10++;
                                        TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                                        if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                                            spannableStringBuilder = v5.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, null, true);
                                        } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                            spannableStringBuilder = c(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks);
                                        } else {
                                            spannableStringBuilder = null;
                                        }
                                        if (spannableStringBuilder != null) {
                                            if (!TextUtils.isEmpty(pageListOrderedItem2.num)) {
                                                valueOf = pageListOrderedItem2.num;
                                            } else {
                                                valueOf = String.valueOf(i11);
                                            }
                                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(u3.c.k(valueOf, ".  "));
                                            spannableStringBuilder6.append((CharSequence) spannableStringBuilder);
                                            arrayList7.add(spannableStringBuilder6);
                                        }
                                        i11++;
                                    }
                                    if (!arrayList7.isEmpty()) {
                                        spannableStringBuilder3 = g(arrayList7);
                                    }
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                                ArrayList arrayList8 = new ArrayList();
                                SpannableStringBuilder r9 = v5.r(pageblocktable.title, null, true);
                                if (!TextUtils.isEmpty(r9)) {
                                    arrayList8.add(r9);
                                }
                                ArrayList<TL_iv.pageTableRow> arrayList9 = pageblocktable.rows;
                                if (arrayList9 != null) {
                                    int size3 = arrayList9.size();
                                    int i12 = 0;
                                    while (i12 < size3) {
                                        TL_iv.pageTableRow pagetablerow = arrayList9.get(i12);
                                        i12++;
                                        TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                                        ArrayList<TL_iv.pageTableCell> arrayList10 = pagetablerow2.cells;
                                        if (arrayList10 != null && !arrayList10.isEmpty()) {
                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                            for (int i13 = 0; i13 < pagetablerow2.cells.size(); i13++) {
                                                if (i13 > 0) {
                                                    spannableStringBuilder7.append((CharSequence) "  |  ");
                                                }
                                                spannableStringBuilder7.append((CharSequence) v5.r(pagetablerow2.cells.get(i13).text, null, true));
                                            }
                                            arrayList8.add(spannableStringBuilder7);
                                        }
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    spannableStringBuilder3 = g(arrayList8);
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                String str2 = ((TL_iv.pageBlockMath) pageBlock).source;
                                if (!TextUtils.isEmpty(str2)) {
                                    spannableStringBuilder3 = l(4, new SpannableStringBuilder(str2));
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                spannableStringBuilder3 = "——————————";
                            } else if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                                if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                                    spannableStringBuilder3 = v5.r(((TL_iv.pageBlockAuthorDate) pageBlock).author, null, true);
                                } else if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockThinking)) {
                                    if (pageBlock.caption != null) {
                                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                        SpannableStringBuilder r10 = v5.r(pageBlock.caption.text, null, true);
                                        if (!TextUtils.isEmpty(r10)) {
                                            spannableStringBuilder8.append((CharSequence) r10);
                                        }
                                        SpannableStringBuilder r11 = v5.r(pageBlock.caption.credit, null, true);
                                        if (!TextUtils.isEmpty(r11)) {
                                            if (spannableStringBuilder8.length() > 0) {
                                                spannableStringBuilder8.append('\n');
                                            }
                                            spannableStringBuilder8.append((CharSequence) r11);
                                        }
                                        if (spannableStringBuilder8.length() > 0) {
                                            spannableStringBuilder3 = spannableStringBuilder8;
                                        }
                                    }
                                } else {
                                    spannableStringBuilder3 = v5.r(pageBlock.text, pageBlock, true);
                                }
                            } else {
                                ?? l10 = l(1, v5.r(pageBlock.text, pageBlock, true));
                                if (!TextUtils.isEmpty(l10)) {
                                    spannableStringBuilder3 = l10;
                                }
                            }
                        } else {
                            if (z10) {
                                richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption;
                            } else {
                                richText = ((TL_iv.pageBlockPullquote) pageBlock).caption;
                            }
                            spannableStringBuilder3 = h(v5.r(pageBlock.text, pageBlock, true), richText);
                        }
                    }
                }
                if (spannableStringBuilder3 != null) {
                    arrayList.add(spannableStringBuilder3);
                }
            }
        }
    }

    public static boolean e(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return false;
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
                if (e(richText2)) {
                    return true;
                }
            }
            return false;
        } else if ((richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMath) || (richText instanceof TL_iv.textButton)) {
            return true;
        } else {
            return e(richText.text);
        }
    }

    public static boolean f(ArrayList arrayList, HashMap hashMap) {
        boolean e10;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a aVar = (a) obj;
                if (aVar == null) {
                    e10 = false;
                    continue;
                } else {
                    ArrayList arrayList2 = aVar.f48335k;
                    if (!aVar.f48333i && aVar.f48329c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.f48328b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z10 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z10 ? 1 : 0) <= 1 && (!z10 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || v5.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        Object obj2 = arrayList2.get(i11);
                                        i11++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !v5.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z10) {
                                    e10 = e(pageBlock.text);
                                    continue;
                                }
                            }
                        }
                    }
                    e10 = true;
                    continue;
                }
                if (e10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder g(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i10 > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i10));
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder h(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        SpannableStringBuilder r6 = v5.r(richText, null, true);
        if (!TextUtils.isEmpty(r6)) {
            if (spannableStringBuilder2.length() > 0) {
                spannableStringBuilder2.append('\n');
            }
            spannableStringBuilder2.append((CharSequence) "— ").append((CharSequence) r6);
        }
        if (spannableStringBuilder2.length() == 0) {
            return null;
        }
        qi0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
        return spannableStringBuilder2;
    }

    public static SpannableStringBuilder i(a aVar, boolean z10) {
        SpannableStringBuilder r6;
        TL_iv.RichText richText = null;
        if (z10) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if (pageBlock != null) {
                richText = pageBlock.text;
            }
            r6 = v5.r(richText, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.f48328b;
            if (pageBlock2 != null) {
                richText = pageBlock2.text;
            }
            r6 = v5.r(richText, pageBlock2, true);
        }
        if (aVar.f48328b instanceof TL_iv.pageBlockPreformatted) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r6);
            spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) aVar.f48328b).language, spannableStringBuilder.toString()), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        return r6;
    }

    public static SpannableStringBuilder j(List list, boolean z10) {
        SpannableStringBuilder r6;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (list != null && i10 < list.size()) {
            a aVar = (a) list.get(i10);
            if (!aVar.f48335k.isEmpty()) {
                long longValue = ((Long) aVar.f48335k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = i10;
                while (i11 < list.size() && !((a) list.get(i11)).f48335k.isEmpty() && ((Long) ((a) list.get(i11)).f48335k.get(0)).longValue() == longValue) {
                    if (i11 > i10) {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append((CharSequence) i((a) list.get(i11), z10));
                    i11++;
                }
                if (spannableStringBuilder.length() > 0) {
                    qi0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), false);
                }
                arrayList.add(spannableStringBuilder);
                i10 = i11;
            } else {
                TL_iv.PageBlock pageBlock = aVar.f48328b;
                if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    arrayList.add(i(aVar, z10));
                } else {
                    boolean z11 = true;
                    if (z10) {
                        r6 = v5.r(pageBlock.text, pageBlock, false);
                    } else {
                        r6 = v5.r(pageBlock.text, pageBlock, true);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r6);
                    TL_iv.PageBlock pageBlock2 = aVar.f48328b;
                    z11 = ((pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed) ? false : false;
                    if (spannableStringBuilder2.length() > 0) {
                        qi0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), z11);
                    }
                    arrayList.add(spannableStringBuilder2);
                }
                i10++;
            }
        }
        return g(arrayList);
    }

    public static SpannableStringBuilder k(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j(arrayList, true));
        int length = spannableStringBuilder.length();
        v5.o(spannableStringBuilder, 0, length, 65536, false, null);
        v5.o(spannableStringBuilder, 0, length, 16384, false, null);
        v5.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (r rVar : (r[]) spannableStringBuilder.getSpans(0, length, r.class)) {
            spannableStringBuilder.removeSpan(rVar);
        }
        return spannableStringBuilder;
    }

    public static CharSequence l(int i10, SpannableStringBuilder spannableStringBuilder) {
        if (TextUtils.isEmpty(spannableStringBuilder)) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        ?? obj = new Object();
        obj.f29024a = i10;
        spannableStringBuilder2.setSpan(new i01(obj, 0), 0, spannableStringBuilder2.length(), 33);
        return spannableStringBuilder2;
    }
}
