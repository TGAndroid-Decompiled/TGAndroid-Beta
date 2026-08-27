package rh;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;

public abstract class u4 {
    public static Object a(Spanned spanned, int i10, int i11, Class cls) {
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
        ArrayList arrayList = new ArrayList();
        if (charSequence == null) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph);
            return arrayList;
        }
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (charSequence.charAt(i10) == '\n') {
                arrayList2.add(Integer.valueOf(i10 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        int length = charSequence.length();
        int i12 = 0;
        while (i12 < size) {
            int i13 = iArr[i12];
            i12++;
            int i14 = i12 < size ? iArr[i12] - 1 : length;
            CodeHighlighting.Span span = spanned == null ? null : (CodeHighlighting.Span) a(spanned, i13, i14, CodeHighlighting.Span.class);
            hi0 hi0Var = (spanned == null || span != null) ? null : (hi0) a(spanned, i13, i14, hi0.class);
            if (span == null && hi0Var == null) {
                CharSequence charSequenceSubSequence = charSequence.subSequence(i13, i14);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = v5.f(charSequenceSubSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                Object obj = span != null ? span : hi0Var;
                while (true) {
                    if (i12 >= size) {
                        length = length;
                        break;
                    }
                    int i15 = iArr[i12];
                    int i16 = i12 + 1;
                    if (i16 < size) {
                        length = iArr[i16] - 1;
                    }
                    if ((span != null ? a(spanned, i15, length, CodeHighlighting.Span.class) : a(spanned, i15, length, hi0.class)) != obj) {
                        break;
                    }
                    i14 = length;
                    i12 = i16;
                    length = length;
                }
                CharSequence charSequenceSubSequence2 = charSequence.subSequence(i13, i14);
                if (span != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = v5.f(charSequenceSubSequence2);
                    String str = span.lng;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = v5.f(charSequenceSubSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    pageblockblockquote.collapsed = hi0Var != null && hi0Var.f29029e;
                    arrayList.add(pageblockblockquote);
                }
                length = length;
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
        SpannableStringBuilder spannableStringBuilderR;
        String str;
        CharSequence charSequenceL;
        SpannableStringBuilder spannableStringBuilderG;
        SpannableStringBuilder spannableStringBuilderG2;
        SpannableStringBuilder spannableStringBuilderG3;
        SpannableStringBuilder spannableStringBuilderG4;
        SpannableStringBuilder spannableStringBuilderH;
        SpannableStringBuilder spannableStringBuilder;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) it.next();
            Object objH = null;
            objH = null;
            objH = null;
            objH = null;
            objH = null;
            objH = null;
            objH = null;
            objH = null;
            objH = null;
            objH = null;
            objH = null;
            objH = null;
            objH = null;
            if (pageBlock != null) {
                int i10 = 0;
                if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                    spannableStringBuilder = new SpannableStringBuilder(v5.r(pageBlock.text, pageBlock, true));
                    spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) pageBlock).language, spannableStringBuilder.toString()), 0, spannableStringBuilder.length(), 33);
                } else {
                    boolean z10 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                    if (z10 || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                        objH = h(v5.r(pageBlock.text, pageBlock, true), z10 ? ((TL_iv.pageBlockBlockquote) pageBlock).caption : ((TL_iv.pageBlockPullquote) pageBlock).caption);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        ArrayList arrayList2 = new ArrayList();
                        d(arrayList2, pageblockblockquoteblocks.blocks);
                        spannableStringBuilderH = h(g(arrayList2), pageblockblockquoteblocks.caption);
                    } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        ArrayList arrayList3 = new ArrayList();
                        SpannableStringBuilder spannableStringBuilderR2 = v5.r(pageblockdetails.title, null, true);
                        if (!TextUtils.isEmpty(spannableStringBuilderR2)) {
                            arrayList3.add(spannableStringBuilderR2);
                        }
                        d(arrayList3, pageblockdetails.blocks);
                        if (!arrayList3.isEmpty()) {
                            spannableStringBuilderG4 = g(arrayList3);
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
                                SpannableStringBuilder spannableStringBuilderR3 = pageListItem2 instanceof TL_iv.TL_pageListItemText ? v5.r(((TL_iv.TL_pageListItemText) pageListItem2).text, null, true) : pageListItem2 instanceof TL_iv.TL_pageListItemBlocks ? c(((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks) : null;
                                if (spannableStringBuilderR3 != null) {
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pageListItem2.checkbox ? pageListItem2.checked ? "☑  " : "☐  " : "•  ");
                                    spannableStringBuilder2.append((CharSequence) spannableStringBuilderR3);
                                    arrayList5.add(spannableStringBuilder2);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                spannableStringBuilderG3 = g(arrayList5);
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
                                SpannableStringBuilder spannableStringBuilderR4 = pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText ? v5.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, null, true) : pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks ? c(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks) : null;
                                if (spannableStringBuilderR4 != null) {
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(s3.c.l(!TextUtils.isEmpty(pageListOrderedItem2.num) ? pageListOrderedItem2.num : String.valueOf(i11), ".  "));
                                    spannableStringBuilder3.append((CharSequence) spannableStringBuilderR4);
                                    arrayList7.add(spannableStringBuilder3);
                                }
                                i11++;
                            }
                            if (!arrayList7.isEmpty()) {
                                spannableStringBuilderG2 = g(arrayList7);
                            }
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                        ArrayList arrayList8 = new ArrayList();
                        SpannableStringBuilder spannableStringBuilderR5 = v5.r(pageblocktable.title, null, true);
                        if (!TextUtils.isEmpty(spannableStringBuilderR5)) {
                            arrayList8.add(spannableStringBuilderR5);
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
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    for (int i13 = 0; i13 < pagetablerow2.cells.size(); i13++) {
                                        if (i13 > 0) {
                                            spannableStringBuilder4.append((CharSequence) "  |  ");
                                        }
                                        spannableStringBuilder4.append((CharSequence) v5.r(pagetablerow2.cells.get(i13).text, null, true));
                                    }
                                    arrayList8.add(spannableStringBuilder4);
                                }
                            }
                        }
                        if (!arrayList8.isEmpty()) {
                            spannableStringBuilderG = g(arrayList8);
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                        String str2 = ((TL_iv.pageBlockMath) pageBlock).source;
                        if (!TextUtils.isEmpty(str2)) {
                            charSequenceL = l(4, new SpannableStringBuilder(str2));
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockDivider) {
                        str = "——————————";
                    } else if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6)) {
                        CharSequence charSequenceL2 = l(1, v5.r(pageBlock.text, pageBlock, true));
                        if (!TextUtils.isEmpty(charSequenceL2)) {
                            objH = charSequenceL2;
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                        spannableStringBuilderR = v5.r(((TL_iv.pageBlockAuthorDate) pageBlock).author, null, true);
                    } else if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockKicker) || (pageBlock instanceof TL_iv.pageBlockThinking)) {
                        objH = v5.r(pageBlock.text, pageBlock, true);
                    } else if (pageBlock.caption != null) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        SpannableStringBuilder spannableStringBuilderR6 = v5.r(pageBlock.caption.text, null, true);
                        if (!TextUtils.isEmpty(spannableStringBuilderR6)) {
                            spannableStringBuilder5.append((CharSequence) spannableStringBuilderR6);
                        }
                        SpannableStringBuilder spannableStringBuilderR7 = v5.r(pageBlock.caption.credit, null, true);
                        if (!TextUtils.isEmpty(spannableStringBuilderR7)) {
                            if (spannableStringBuilder5.length() > 0) {
                                spannableStringBuilder5.append('\n');
                            }
                            spannableStringBuilder5.append((CharSequence) spannableStringBuilderR7);
                        }
                        if (spannableStringBuilder5.length() > 0) {
                            objH = spannableStringBuilder5;
                        }
                    }
                }
            }
            if (objH != null) {
                objH = spannableStringBuilderR;
                objH = str;
                objH = charSequenceL;
                objH = spannableStringBuilderG;
                objH = spannableStringBuilderG2;
                objH = spannableStringBuilderG3;
                objH = spannableStringBuilderG4;
                objH = spannableStringBuilderH;
                objH = spannableStringBuilder;
                arrayList.add(objH);
            } else {
                objH = spannableStringBuilderR;
                objH = str;
                objH = charSequenceL;
                objH = spannableStringBuilderG;
                objH = spannableStringBuilderG2;
                objH = spannableStringBuilderG3;
                objH = spannableStringBuilderG4;
                objH = spannableStringBuilderH;
                objH = spannableStringBuilder;
            }
        }
    }

    public static boolean e(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return false;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if ((richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMath) || (richText instanceof TL_iv.textButton)) {
                return true;
            }
            return e(richText.text);
        }
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
    }

    public static boolean f(ArrayList arrayList, HashMap map) {
        boolean zE;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a aVar = (a) obj;
                if (aVar == null) {
                    zE = false;
                } else {
                    ArrayList arrayList2 = aVar.f47035k;
                    if (!aVar.f47033i && aVar.f47029c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.f47028b;
                        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            zE = true;
                        } else {
                            boolean z10 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z10 ? 1 : 0) > 1 || (z10 && (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) != null && !(richText instanceof TL_iv.textEmpty) && !v5.l(richText).isEmpty())) {
                                zE = true;
                            } else if (map != null && !arrayList2.isEmpty()) {
                                int size2 = arrayList2.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size2) {
                                        Object obj2 = arrayList2.get(i11);
                                        i11++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) map.get((Long) obj2);
                                        if (richText2 == null || (richText2 instanceof TL_iv.textEmpty) || v5.l(richText2).isEmpty()) {
                                        }
                                    } else {
                                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                                        }
                                        zE = e(pageBlock.text);
                                    }
                                    zE = true;
                                }
                            } else if (!(pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z10) {
                                zE = e(pageBlock.text);
                            } else {
                                zE = true;
                            }
                        }
                    } else {
                        zE = true;
                    }
                }
                if (zE) {
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
        SpannableStringBuilder spannableStringBuilderR = v5.r(richText, null, true);
        if (!TextUtils.isEmpty(spannableStringBuilderR)) {
            if (spannableStringBuilder2.length() > 0) {
                spannableStringBuilder2.append('\n');
            }
            spannableStringBuilder2.append((CharSequence) "— ").append((CharSequence) spannableStringBuilderR);
        }
        if (spannableStringBuilder2.length() == 0) {
            return null;
        }
        hi0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
        return spannableStringBuilder2;
    }

    public static SpannableStringBuilder i(a aVar, boolean z10) {
        SpannableStringBuilder spannableStringBuilderR;
        if (z10) {
            TL_iv.PageBlock pageBlock = aVar.f47028b;
            spannableStringBuilderR = v5.r(pageBlock != null ? pageBlock.text : null, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.f47028b;
            spannableStringBuilderR = v5.r(pageBlock2 != null ? pageBlock2.text : null, pageBlock2, true);
        }
        if (!(aVar.f47028b instanceof TL_iv.pageBlockPreformatted)) {
            return spannableStringBuilderR;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderR);
        spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) aVar.f47028b).language, spannableStringBuilder.toString()), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder j(List list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (list != null && i10 < list.size()) {
            a aVar = (a) list.get(i10);
            if (aVar.f47035k.isEmpty()) {
                TL_iv.PageBlock pageBlock = aVar.f47028b;
                if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z10 ? v5.r(pageBlock.text, pageBlock, false) : v5.r(pageBlock.text, pageBlock, true));
                    TL_iv.PageBlock pageBlock2 = aVar.f47028b;
                    boolean z11 = (pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed;
                    if (spannableStringBuilder.length() > 0) {
                        hi0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), z11);
                    }
                    arrayList.add(spannableStringBuilder);
                } else {
                    arrayList.add(i(aVar, z10));
                }
                i10++;
            } else {
                long jLongValue = ((Long) aVar.f47035k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i11 = i10;
                while (i11 < list.size() && !((a) list.get(i11)).f47035k.isEmpty() && ((Long) ((a) list.get(i11)).f47035k.get(0)).longValue() == jLongValue) {
                    if (i11 > i10) {
                        spannableStringBuilder2.append('\n');
                    }
                    spannableStringBuilder2.append((CharSequence) i((a) list.get(i11), z10));
                    i11++;
                }
                if (spannableStringBuilder2.length() > 0) {
                    hi0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
                }
                arrayList.add(spannableStringBuilder2);
                i10 = i11;
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
        xz0 xz0Var = new xz0();
        xz0Var.f34734a = i10;
        spannableStringBuilder2.setSpan(new yz0(xz0Var, 0), 0, spannableStringBuilder2.length(), 33);
        return spannableStringBuilder2;
    }
}
