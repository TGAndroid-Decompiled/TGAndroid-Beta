package vh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public abstract class w4 {
    public static ArrayList a(int i10, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            b((TL_iv.PageBlock) obj, linkedHashSet);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashSet.size());
        MessagesController messagesController = MessagesController.getInstance(i10);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            l10.getClass();
            TLRPC.User user = messagesController.getUser(l10);
            if (user != null) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(user);
                if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                    arrayList2.add(inputUser);
                }
            }
        }
        return arrayList2;
    }

    public static void b(TL_iv.PageBlock pageBlock, LinkedHashSet linkedHashSet) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        if (pageBlock != null) {
            d(pageBlock.text, linkedHashSet);
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                d(pageCaption.text, linkedHashSet);
                d(pageCaption.credit, linkedHashSet);
            }
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                ArrayList<TL_keyboard.PageButton> arrayList2 = ((TL_iv.pageBlockButtonRow) pageBlock).buttons;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TL_keyboard.PageButton pageButton = arrayList2.get(i10);
                        i10++;
                        TL_keyboard.PageButton pageButton2 = pageButton;
                        if (pageButton2 != null) {
                            TL_keyboard.InlineButtonType inlineButtonType = pageButton2.type;
                            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                                long j10 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                                if (j10 != 0) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                            d(pageButton2.text, linkedHashSet);
                        }
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                d(((TL_iv.pageBlockBlockquote) pageBlock).caption, linkedHashSet);
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                d(((TL_iv.pageBlockPullquote) pageBlock).caption, linkedHashSet);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                d(pageblockblockquoteblocks.caption, linkedHashSet);
                c(pageblockblockquoteblocks.blocks, linkedHashSet);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                d(pageblockdetails.title, linkedHashSet);
                c(pageblockdetails.blocks, linkedHashSet);
            } else if (pageBlock instanceof TL_iv.pageBlockList) {
                ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        TL_iv.PageListItem pageListItem = arrayList3.get(i10);
                        i10++;
                        TL_iv.PageListItem pageListItem2 = pageListItem;
                        if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                            d(((TL_iv.TL_pageListItemText) pageListItem2).text, linkedHashSet);
                        } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                            c(((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, linkedHashSet);
                        }
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                ArrayList<TL_iv.PageListOrderedItem> arrayList4 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
                if (arrayList4 != null) {
                    int size3 = arrayList4.size();
                    while (i10 < size3) {
                        TL_iv.PageListOrderedItem pageListOrderedItem = arrayList4.get(i10);
                        i10++;
                        TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                        if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                            d(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, linkedHashSet);
                        } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            c(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, linkedHashSet);
                        }
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                d(pageblocktable.title, linkedHashSet);
                ArrayList<TL_iv.pageTableRow> arrayList5 = pageblocktable.rows;
                if (arrayList5 != null) {
                    int size4 = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        TL_iv.pageTableRow pagetablerow = arrayList5.get(i11);
                        i11++;
                        TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                        if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                            int size5 = arrayList.size();
                            int i12 = 0;
                            while (i12 < size5) {
                                TL_iv.pageTableCell pagetablecell = arrayList.get(i12);
                                i12++;
                                TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                                if (pagetablecell2 != null) {
                                    d(pagetablecell2.text, linkedHashSet);
                                }
                            }
                        }
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                c(((TL_iv.pageBlockCollage) pageBlock).items, linkedHashSet);
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                c(((TL_iv.pageBlockSlideshow) pageBlock).items, linkedHashSet);
            } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                c(((TL_iv.pageBlockEmbedPost) pageBlock).blocks, linkedHashSet);
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                b(((TL_iv.pageBlockCover) pageBlock).cover, linkedHashSet);
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                d(((TL_iv.pageBlockRelatedArticles) pageBlock).title, linkedHashSet);
            }
        }
    }

    public static void c(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                b((TL_iv.PageBlock) obj, linkedHashSet);
            }
        }
    }

    public static void d(TL_iv.RichText richText, LinkedHashSet linkedHashSet) {
        if (richText != null) {
            if (richText instanceof TL_iv.textButton) {
                TL_keyboard.InlineButtonType inlineButtonType = ((TL_iv.textButton) richText).type;
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    long j10 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                    if (j10 != 0) {
                        linkedHashSet.add(Long.valueOf(j10));
                    }
                }
            } else if (richText instanceof TL_iv.textDiff) {
                d(((TL_iv.textDiff) richText).old_text, linkedHashSet);
            }
            d(richText.text, linkedHashSet);
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i10);
                    i10++;
                    d(richText2, linkedHashSet);
                }
            }
        }
    }
}
