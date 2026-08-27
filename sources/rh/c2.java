package rh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

public final class c2 {

    public int f47081a;

    public int f47082b;

    public int f47083c;
    public int d;

    public int f47084e;

    public static void a(TL_iv.RichText richText, int i10, c2 c2Var) {
        if (richText == null) {
            return;
        }
        c2Var.f47081a = v5.l(richText).length() + c2Var.f47081a;
        int iC = c(richText) + i10;
        if (iC > c2Var.f47083c) {
            c2Var.f47083c = iC;
        }
    }

    public static void b(TL_iv.PageBlock pageBlock, int i10, c2 c2Var) {
        int iN;
        if (pageBlock == null) {
            return;
        }
        if (i10 > c2Var.f47083c) {
            c2Var.f47083c = i10;
        }
        a(pageBlock.text, i10, c2Var);
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            a(((TL_iv.pageBlockBlockquote) pageBlock).caption, i10, c2Var);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            a(((TL_iv.pageBlockPullquote) pageBlock).caption, i10, c2Var);
            return;
        }
        int i11 = 0;
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            a(pageblockblockquoteblocks.caption, i10, c2Var);
            c2Var.f47082b = pageblockblockquoteblocks.blocks.size() + c2Var.f47082b;
            while (i11 < pageblockblockquoteblocks.blocks.size()) {
                b(pageblockblockquoteblocks.blocks.get(i11), i10 + 1, c2Var);
                i11++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            a(pageblockdetails.title, i10, c2Var);
            c2Var.f47082b = pageblockdetails.blocks.size() + c2Var.f47082b;
            while (i11 < pageblockdetails.blocks.size()) {
                b(pageblockdetails.blocks.get(i11), i10 + 1, c2Var);
                i11++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            c2Var.f47082b = pageblocklist.items.size() + c2Var.f47082b;
            for (int i12 = 0; i12 < pageblocklist.items.size(); i12++) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i12);
                int i13 = i10 + 1;
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    a(((TL_iv.TL_pageListItemText) pageListItem).text, i13, c2Var);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        b(arrayList.get(i14), i13, c2Var);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            c2Var.f47082b = pageblockorderedlist.items.size() + c2Var.f47082b;
            for (int i15 = 0; i15 < pageblockorderedlist.items.size(); i15++) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i15);
                int i16 = i10 + 1;
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    a(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, i16, c2Var);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                        b(arrayList2.get(i17), i16, c2Var);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            a(pageblocktable.title, i10, c2Var);
            ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
            if (arrayList3 != null) {
                c2Var.f47082b = arrayList3.size() + c2Var.f47082b;
                for (int i18 = 0; i18 < pageblocktable.rows.size(); i18++) {
                    TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i18);
                    if (pagetablerow.cells != null) {
                        iN = 0;
                        for (int i19 = 0; i19 < pagetablerow.cells.size(); i19++) {
                            TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i19);
                            iN += x5.n(pagetablecell);
                            a(pagetablecell.text, i10 + 1, c2Var);
                        }
                    } else {
                        iN = 0;
                    }
                    if (iN > c2Var.f47084e) {
                        c2Var.f47084e = iN;
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            ArrayList<TL_keyboard.PageButton> arrayList4 = ((TL_iv.pageBlockButtonRow) pageBlock).buttons;
            if (arrayList4 != null) {
                int size = arrayList4.size();
                while (i11 < size) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i11);
                    i11++;
                    TL_keyboard.PageButton pageButton2 = pageButton;
                    if (pageButton2 != null) {
                        a(pageButton2.text, i10 + 1, c2Var);
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                a(pageCaption.text, i10, c2Var);
                a(pageCaption.credit, i10, c2Var);
            }
            ArrayList<TL_iv.PageBlock> arrayList5 = ((TL_iv.pageBlockCollage) pageBlock).items;
            while (i11 < arrayList5.size()) {
                b(arrayList5.get(i11), i10 + 1, c2Var);
                i11++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.PageCaption pageCaption2 = pageBlock.caption;
            if (pageCaption2 != null) {
                a(pageCaption2.text, i10, c2Var);
                a(pageCaption2.credit, i10, c2Var);
            }
            ArrayList<TL_iv.PageBlock> arrayList6 = ((TL_iv.pageBlockSlideshow) pageBlock).items;
            while (i11 < arrayList6.size()) {
                b(arrayList6.get(i11), i10 + 1, c2Var);
                i11++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            String str = ((TL_iv.pageBlockMath) pageBlock).source;
            if (str != null) {
                c2Var.f47081a = str.length() + c2Var.f47081a;
                return;
            }
            return;
        }
        TL_iv.PageCaption pageCaption3 = pageBlock.caption;
        if (pageCaption3 == null) {
            return;
        }
        a(pageCaption3.text, i10, c2Var);
        a(pageCaption3.credit, i10, c2Var);
    }

    public static int c(TL_iv.RichText richText) {
        int iMax = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return 0;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return c(richText.text) + 1;
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            iMax = Math.max(iMax, c(richText2));
        }
        return iMax;
    }
}
