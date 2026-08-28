package qh;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.wz0;
public abstract class t4 {
    public static Object a(Spanned spanned, int i9, int i10, Class cls) {
        Object[] spans;
        for (Object obj : spanned.getSpans(i9, Math.max(i9, i10), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i9 && spanEnd >= i10) {
                return obj;
            }
        }
        return null;
    }

    public static ArrayList b(CharSequence charSequence) {
        Spanned spanned;
        int i9;
        CodeHighlighting.Span span;
        fi0 fi0Var;
        fi0 fi0Var2;
        int i10;
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
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (charSequence.charAt(i11) == '\n') {
                arrayList2.add(Integer.valueOf(i11 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < size) {
            int i14 = iArr[i13];
            i13++;
            if (i13 < size) {
                i9 = iArr[i13] - 1;
            } else {
                i9 = length;
            }
            if (spanned == null) {
                span = null;
            } else {
                span = (CodeHighlighting.Span) a(spanned, i14, i9, CodeHighlighting.Span.class);
            }
            if (spanned != null && span == null) {
                fi0Var = (fi0) a(spanned, i14, i9, fi0.class);
            } else {
                fi0Var = null;
            }
            if (span == null && fi0Var == null) {
                CharSequence subSequence = charSequence.subSequence(i14, i9);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = u5.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                if (span != null) {
                    fi0Var2 = span;
                } else {
                    fi0Var2 = fi0Var;
                }
                while (true) {
                    if (i13 < size) {
                        int i15 = iArr[i13];
                        int i16 = i13 + 1;
                        if (i16 < size) {
                            i10 = length;
                            length = iArr[i16] - 1;
                        } else {
                            i10 = length;
                        }
                        if (span != null) {
                            a2 = a(spanned, i15, length, CodeHighlighting.Span.class);
                        } else {
                            a2 = a(spanned, i15, length, fi0.class);
                        }
                        if (a2 != fi0Var2) {
                            break;
                        }
                        i9 = length;
                        i13 = i16;
                        length = i10;
                    } else {
                        i10 = length;
                        break;
                    }
                }
                CharSequence subSequence2 = charSequence.subSequence(i14, i9);
                if (span != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = u5.f(subSequence2);
                    String str = span.lng;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = u5.f(subSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    if (fi0Var != null && fi0Var.f28439e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pageblockblockquote.collapsed = z10;
                    arrayList.add(pageblockblockquote);
                }
                length = i10;
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
                    int i9 = 0;
                    if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(u5.r(pageBlock.text, pageBlock, true));
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
                                SpannableStringBuilder r10 = u5.r(pageblockdetails.title, null, true);
                                if (!TextUtils.isEmpty(r10)) {
                                    arrayList3.add(r10);
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
                                    while (i9 < size) {
                                        TL_iv.PageListItem pageListItem = arrayList4.get(i9);
                                        i9++;
                                        TL_iv.PageListItem pageListItem2 = pageListItem;
                                        if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                                            spannableStringBuilder2 = u5.r(((TL_iv.TL_pageListItemText) pageListItem2).text, null, true);
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
                                    int i10 = 1;
                                    while (i9 < size2) {
                                        TL_iv.PageListOrderedItem pageListOrderedItem = arrayList6.get(i9);
                                        i9++;
                                        TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                                        if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                                            spannableStringBuilder = u5.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, null, true);
                                        } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                            spannableStringBuilder = c(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks);
                                        } else {
                                            spannableStringBuilder = null;
                                        }
                                        if (spannableStringBuilder != null) {
                                            if (!TextUtils.isEmpty(pageListOrderedItem2.num)) {
                                                valueOf = pageListOrderedItem2.num;
                                            } else {
                                                valueOf = String.valueOf(i10);
                                            }
                                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(ta.b.j(valueOf, ".  "));
                                            spannableStringBuilder6.append((CharSequence) spannableStringBuilder);
                                            arrayList7.add(spannableStringBuilder6);
                                        }
                                        i10++;
                                    }
                                    if (!arrayList7.isEmpty()) {
                                        spannableStringBuilder3 = g(arrayList7);
                                    }
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                                ArrayList arrayList8 = new ArrayList();
                                SpannableStringBuilder r11 = u5.r(pageblocktable.title, null, true);
                                if (!TextUtils.isEmpty(r11)) {
                                    arrayList8.add(r11);
                                }
                                ArrayList<TL_iv.pageTableRow> arrayList9 = pageblocktable.rows;
                                if (arrayList9 != null) {
                                    int size3 = arrayList9.size();
                                    int i11 = 0;
                                    while (i11 < size3) {
                                        TL_iv.pageTableRow pagetablerow = arrayList9.get(i11);
                                        i11++;
                                        TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                                        ArrayList<TL_iv.pageTableCell> arrayList10 = pagetablerow2.cells;
                                        if (arrayList10 != null && !arrayList10.isEmpty()) {
                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                            for (int i12 = 0; i12 < pagetablerow2.cells.size(); i12++) {
                                                if (i12 > 0) {
                                                    spannableStringBuilder7.append((CharSequence) "  |  ");
                                                }
                                                spannableStringBuilder7.append((CharSequence) u5.r(pagetablerow2.cells.get(i12).text, null, true));
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
                                    spannableStringBuilder3 = u5.r(((TL_iv.pageBlockAuthorDate) pageBlock).author, null, true);
                                } else if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockThinking)) {
                                    if (pageBlock.caption != null) {
                                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                        SpannableStringBuilder r12 = u5.r(pageBlock.caption.text, null, true);
                                        if (!TextUtils.isEmpty(r12)) {
                                            spannableStringBuilder8.append((CharSequence) r12);
                                        }
                                        SpannableStringBuilder r13 = u5.r(pageBlock.caption.credit, null, true);
                                        if (!TextUtils.isEmpty(r13)) {
                                            if (spannableStringBuilder8.length() > 0) {
                                                spannableStringBuilder8.append('\n');
                                            }
                                            spannableStringBuilder8.append((CharSequence) r13);
                                        }
                                        if (spannableStringBuilder8.length() > 0) {
                                            spannableStringBuilder3 = spannableStringBuilder8;
                                        }
                                    }
                                } else {
                                    spannableStringBuilder3 = u5.r(pageBlock.text, pageBlock, true);
                                }
                            } else {
                                ?? l10 = l(1, u5.r(pageBlock.text, pageBlock, true));
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
                            spannableStringBuilder3 = h(u5.r(pageBlock.text, pageBlock, true), richText);
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
            int i9 = 0;
            while (i9 < size) {
                TL_iv.RichText richText2 = arrayList.get(i9);
                i9++;
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
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                a aVar = (a) obj;
                if (aVar == null) {
                    e10 = false;
                    continue;
                } else {
                    ArrayList arrayList2 = aVar.f46276k;
                    if (!aVar.f46274i && aVar.f46270c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.f46269b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z10 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z10 ? 1 : 0) <= 1 && (!z10 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || u5.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i10 = 0;
                                    while (i10 < size2) {
                                        Object obj2 = arrayList2.get(i10);
                                        i10++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !u5.l(richText2).isEmpty()) {
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
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (i9 > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i9));
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder h(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        SpannableStringBuilder r10 = u5.r(richText, null, true);
        if (!TextUtils.isEmpty(r10)) {
            if (spannableStringBuilder2.length() > 0) {
                spannableStringBuilder2.append('\n');
            }
            spannableStringBuilder2.append((CharSequence) "— ").append((CharSequence) r10);
        }
        if (spannableStringBuilder2.length() == 0) {
            return null;
        }
        fi0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
        return spannableStringBuilder2;
    }

    public static SpannableStringBuilder i(a aVar, boolean z10) {
        SpannableStringBuilder r10;
        TL_iv.RichText richText = null;
        if (z10) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if (pageBlock != null) {
                richText = pageBlock.text;
            }
            r10 = u5.r(richText, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.f46269b;
            if (pageBlock2 != null) {
                richText = pageBlock2.text;
            }
            r10 = u5.r(richText, pageBlock2, true);
        }
        if (aVar.f46269b instanceof TL_iv.pageBlockPreformatted) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r10);
            spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) aVar.f46269b).language, spannableStringBuilder.toString()), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        return r10;
    }

    public static SpannableStringBuilder j(List list, boolean z10) {
        SpannableStringBuilder r10;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (list != null && i9 < list.size()) {
            a aVar = (a) list.get(i9);
            if (!aVar.f46276k.isEmpty()) {
                long longValue = ((Long) aVar.f46276k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i10 = i9;
                while (i10 < list.size() && !((a) list.get(i10)).f46276k.isEmpty() && ((Long) ((a) list.get(i10)).f46276k.get(0)).longValue() == longValue) {
                    if (i10 > i9) {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append((CharSequence) i((a) list.get(i10), z10));
                    i10++;
                }
                if (spannableStringBuilder.length() > 0) {
                    fi0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), false);
                }
                arrayList.add(spannableStringBuilder);
                i9 = i10;
            } else {
                TL_iv.PageBlock pageBlock = aVar.f46269b;
                if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    arrayList.add(i(aVar, z10));
                } else {
                    boolean z11 = true;
                    if (z10) {
                        r10 = u5.r(pageBlock.text, pageBlock, false);
                    } else {
                        r10 = u5.r(pageBlock.text, pageBlock, true);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r10);
                    TL_iv.PageBlock pageBlock2 = aVar.f46269b;
                    z11 = ((pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed) ? false : false;
                    if (spannableStringBuilder2.length() > 0) {
                        fi0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), z11);
                    }
                    arrayList.add(spannableStringBuilder2);
                }
                i9++;
            }
        }
        return g(arrayList);
    }

    public static SpannableStringBuilder k(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j(arrayList, true));
        int length = spannableStringBuilder.length();
        u5.o(spannableStringBuilder, 0, length, 65536, false, null);
        u5.o(spannableStringBuilder, 0, length, 16384, false, null);
        u5.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (r rVar : (r[]) spannableStringBuilder.getSpans(0, length, r.class)) {
            spannableStringBuilder.removeSpan(rVar);
        }
        return spannableStringBuilder;
    }

    public static CharSequence l(int i9, SpannableStringBuilder spannableStringBuilder) {
        if (TextUtils.isEmpty(spannableStringBuilder)) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        ?? obj = new Object();
        obj.f34062a = i9;
        spannableStringBuilder2.setSpan(new wz0(obj, 0), 0, spannableStringBuilder2.length(), 33);
        return spannableStringBuilder2;
    }
}
