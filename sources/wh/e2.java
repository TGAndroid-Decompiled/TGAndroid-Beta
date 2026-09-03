package wh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class e2 {
    public int f49755a;
    public int f49756b;
    public int f49757c;
    public int d;
    public int f49758e;

    public static void a(TL_iv.RichText richText, int i10, e2 e2Var) {
        if (richText != null) {
            e2Var.f49755a = x5.l(richText).length() + e2Var.f49755a;
            int c3 = c(richText) + i10;
            if (c3 > e2Var.f49757c) {
                e2Var.f49757c = c3;
            }
        }
    }

    public static void b(TL_iv.PageBlock pageBlock, int i10, e2 e2Var) {
        int i11;
        if (pageBlock != null) {
            if (i10 > e2Var.f49757c) {
                e2Var.f49757c = i10;
            }
            a(pageBlock.text, i10, e2Var);
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                a(((TL_iv.pageBlockBlockquote) pageBlock).caption, i10, e2Var);
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                a(((TL_iv.pageBlockPullquote) pageBlock).caption, i10, e2Var);
            } else {
                int i12 = 0;
                if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    a(pageblockblockquoteblocks.caption, i10, e2Var);
                    e2Var.f49756b = pageblockblockquoteblocks.blocks.size() + e2Var.f49756b;
                    while (i12 < pageblockblockquoteblocks.blocks.size()) {
                        b(pageblockblockquoteblocks.blocks.get(i12), i10 + 1, e2Var);
                        i12++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                    a(pageblockdetails.title, i10, e2Var);
                    e2Var.f49756b = pageblockdetails.blocks.size() + e2Var.f49756b;
                    while (i12 < pageblockdetails.blocks.size()) {
                        b(pageblockdetails.blocks.get(i12), i10 + 1, e2Var);
                        i12++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    e2Var.f49756b = pageblocklist.items.size() + e2Var.f49756b;
                    for (int i13 = 0; i13 < pageblocklist.items.size(); i13++) {
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i13);
                        int i14 = i10 + 1;
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            a(((TL_iv.TL_pageListItemText) pageListItem).text, i14, e2Var);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                b(arrayList.get(i15), i14, e2Var);
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    e2Var.f49756b = pageblockorderedlist.items.size() + e2Var.f49756b;
                    for (int i16 = 0; i16 < pageblockorderedlist.items.size(); i16++) {
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i16);
                        int i17 = i10 + 1;
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            a(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, i17, e2Var);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                b(arrayList2.get(i18), i17, e2Var);
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                    a(pageblocktable.title, i10, e2Var);
                    ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
                    if (arrayList3 != null) {
                        e2Var.f49756b = arrayList3.size() + e2Var.f49756b;
                        for (int i19 = 0; i19 < pageblocktable.rows.size(); i19++) {
                            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i19);
                            if (pagetablerow.cells != null) {
                                i11 = 0;
                                for (int i20 = 0; i20 < pagetablerow.cells.size(); i20++) {
                                    TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i20);
                                    i11 += z5.n(pagetablecell);
                                    a(pagetablecell.text, i10 + 1, e2Var);
                                }
                            } else {
                                i11 = 0;
                            }
                            if (i11 > e2Var.f49758e) {
                                e2Var.f49758e = i11;
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    ArrayList<TL_keyboard.PageButton> arrayList4 = ((TL_iv.pageBlockButtonRow) pageBlock).buttons;
                    if (arrayList4 != null) {
                        int size = arrayList4.size();
                        while (i12 < size) {
                            TL_keyboard.PageButton pageButton = arrayList4.get(i12);
                            i12++;
                            TL_keyboard.PageButton pageButton2 = pageButton;
                            if (pageButton2 != null) {
                                a(pageButton2.text, i10 + 1, e2Var);
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.PageCaption pageCaption = pageBlock.caption;
                    if (pageCaption != null) {
                        a(pageCaption.text, i10, e2Var);
                        a(pageCaption.credit, i10, e2Var);
                    }
                    ArrayList<TL_iv.PageBlock> arrayList5 = ((TL_iv.pageBlockCollage) pageBlock).items;
                    while (i12 < arrayList5.size()) {
                        b(arrayList5.get(i12), i10 + 1, e2Var);
                        i12++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.PageCaption pageCaption2 = pageBlock.caption;
                    if (pageCaption2 != null) {
                        a(pageCaption2.text, i10, e2Var);
                        a(pageCaption2.credit, i10, e2Var);
                    }
                    ArrayList<TL_iv.PageBlock> arrayList6 = ((TL_iv.pageBlockSlideshow) pageBlock).items;
                    while (i12 < arrayList6.size()) {
                        b(arrayList6.get(i12), i10 + 1, e2Var);
                        i12++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                    String str = ((TL_iv.pageBlockMath) pageBlock).source;
                    if (str != null) {
                        e2Var.f49755a = str.length() + e2Var.f49755a;
                    }
                } else {
                    TL_iv.PageCaption pageCaption3 = pageBlock.caption;
                    if (pageCaption3 == null) {
                        return;
                    }
                    a(pageCaption3.text, i10, e2Var);
                    a(pageCaption3.credit, i10, e2Var);
                }
            }
        }
    }

    public static int c(TL_iv.RichText richText) {
        int i10 = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return 0;
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_iv.RichText richText2 = arrayList.get(i11);
                i11++;
                i10 = Math.max(i10, c(richText2));
            }
            return i10;
        }
        return c(richText.text) + 1;
    }
}
