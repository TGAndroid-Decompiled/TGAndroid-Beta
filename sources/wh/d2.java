package wh;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ai;
public final class d2 {
    public final ai f49731a;
    public boolean f49734e;
    public boolean f49735f;
    public final ArrayDeque f49732b = new ArrayDeque();
    public final ArrayDeque f49733c = new ArrayDeque();
    public final v1 f49736g = new v1(this, 1);
    public c2 d = b();

    public d2(ai aiVar) {
        this.f49731a = aiVar;
    }

    public static void e(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.text == null) {
                pageBlock.text = new TL_iv.textEmpty();
            }
            if (pageBlock.caption == null) {
                TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                pageCaption.text = new TL_iv.textEmpty();
                pageCaption.credit = new TL_iv.textEmpty();
                pageBlock.caption = pageCaption;
            }
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                if (pageblockblockquoteblocks.blocks == null) {
                    pageblockblockquoteblocks.blocks = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList = pageblockblockquoteblocks.blocks;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TL_iv.PageBlock pageBlock2 = arrayList.get(i11);
                    i11++;
                    e(pageBlock2);
                }
                if (pageblockblockquoteblocks.caption == null) {
                    pageblockblockquoteblocks.caption = new TL_iv.textEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.caption == null) {
                    pageblockpullquote.caption = new TL_iv.textEmpty();
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (pageblockpreformatted.language == null) {
                    pageblockpreformatted.language = "";
                }
            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                if (pageblockmath.source == null) {
                    pageblockmath.source = "";
                }
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                if (pageblockmap.geo == null) {
                    pageblockmap.geo = new TLRPC.TL_geoPointEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows == null) {
                    pageblocktable.rows = new ArrayList<>();
                }
                ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    TL_iv.pageTableRow pagetablerow = arrayList2.get(i12);
                    i12++;
                    TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                    if (pagetablerow2 != null) {
                        if (pagetablerow2.cells == null) {
                            pagetablerow2.cells = new ArrayList<>();
                        }
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            TL_iv.pageTableCell pagetablecell = arrayList3.get(i13);
                            i13++;
                            TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                            if (pagetablecell2 != null && pagetablecell2.text == null) {
                                pagetablecell2.text = new TL_iv.textEmpty();
                            }
                        }
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                if (pageblockbuttonrow.buttons == null) {
                    pageblockbuttonrow.buttons = new ArrayList<>();
                }
                ArrayList<TL_keyboard.PageButton> arrayList4 = pageblockbuttonrow.buttons;
                int size4 = arrayList4.size();
                while (i10 < size4) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i10);
                    i10++;
                    TL_keyboard.PageButton pageButton2 = pageButton;
                    if (pageButton2 != null && pageButton2.text == null) {
                        pageButton2.text = new TL_iv.textEmpty();
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                if (pageblockcollage.items == null) {
                    pageblockcollage.items = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList5 = pageblockcollage.items;
                int size5 = arrayList5.size();
                while (i10 < size5) {
                    TL_iv.PageBlock pageBlock3 = arrayList5.get(i10);
                    i10++;
                    e(pageBlock3);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                if (pageblockslideshow.items == null) {
                    pageblockslideshow.items = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
                int size6 = arrayList6.size();
                while (i10 < size6) {
                    TL_iv.PageBlock pageBlock4 = arrayList6.get(i10);
                    i10++;
                    e(pageBlock4);
                }
            }
        }
    }

    public final void a(wh.c2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: wh.d2.a(wh.c2):void");
    }

    public final c2 b() {
        a2 a2Var;
        j0 j0Var;
        int i10;
        ArrayList arrayList;
        b2[] b2VarArr;
        ai aiVar = this.f49731a;
        ArrayList arrayList2 = ((r3) aiVar.f25257b).f50024i3;
        HashMap hashMap = new HashMap();
        c2 c2Var = this.d;
        if (c2Var != null) {
            for (b2 b2Var : c2Var.f49721a) {
                hashMap.put(Long.valueOf(b2Var.f49689a), b2Var);
            }
        }
        b2[] b2VarArr2 = new b2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f49653b;
            ArrayList arrayList3 = aVar.f49660k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            b2 b2Var2 = (b2) hashMap.get(Long.valueOf(aVar.f49652a));
            if (b2Var2 != null && b2Var2.f49691c == aVar.f49654c && b2Var2.d == aVar.d && b2Var2.f49692e == aVar.f49655e && b2Var2.f49693f == aVar.f49656f && b2Var2.f49694g == aVar.f49658i && b2Var2.h == aVar.f49657g) {
                ArrayList arrayList4 = b2Var2.f49695i;
                ArrayList arrayList5 = aVar.h;
                if (arrayList4 != arrayList5) {
                    if (arrayList4 != null && arrayList5 != null && arrayList4.size() == arrayList5.size()) {
                        for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                            if (arrayList4.get(i12) != arrayList5.get(i12)) {
                                break;
                            }
                        }
                    }
                }
                if (b2Var2.f49696j.equals(arrayList3) && Arrays.equals(b2Var2.f49690b, byteArray)) {
                    b2VarArr2[i11] = b2Var2;
                }
            }
            long j10 = aVar.f49652a;
            int i13 = aVar.f49654c;
            int i14 = aVar.d;
            boolean z4 = aVar.f49655e;
            boolean z10 = aVar.f49656f;
            boolean z11 = aVar.f49658i;
            t tVar = aVar.f49657g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            b2VarArr2[i11] = new b2(j10, byteArray, i13, i14, z4, z10, z11, tVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((r3) aiVar.f25257b).findFocus();
        if (findFocus instanceof e1) {
            e1 e1Var = (e1) findFocus;
            int selectionStart = e1Var.getSelectionStart();
            int selectionEnd = e1Var.getSelectionEnd();
            i5 T2 = r3.T2(e1Var);
            if (T2 != null && T2.getRow() != null) {
                if (e1Var == T2.getTitleEditText()) {
                    a2Var = new a2(T2.getRow().f49652a, 0, selectionStart, selectionEnd);
                } else {
                    l5 o10 = T2.o(e1Var);
                    if (o10 != null) {
                        i10 = T2.k(o10.f49904b);
                    } else {
                        i10 = -1;
                    }
                    a2Var = new a2(T2.getRow().f49652a, i10, selectionStart, selectionEnd);
                }
            } else {
                if (e1Var instanceof j0) {
                    j0Var = (j0) e1Var;
                } else {
                    ViewParent parent = e1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof j0) {
                                j0Var = (j0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            j0Var = null;
                            break;
                        }
                    }
                }
                if (j0Var != null && j0Var.getRow() != null) {
                    a2Var = new a2(j0Var.getRow().f49652a, -1, selectionStart, selectionEnd);
                } else {
                    while (e1Var != 0 && !(e1Var instanceof v5)) {
                        ViewParent parent2 = e1Var.getParent();
                        if (parent2 instanceof View) {
                            e1Var = (View) parent2;
                        } else {
                            e1Var = 0;
                        }
                    }
                    if (e1Var instanceof v5) {
                        v5 v5Var = (v5) e1Var;
                        if (v5Var.getRow() != null) {
                            a2Var = new a2(v5Var.getRow().f49652a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new c2(b2VarArr2, a2Var);
        }
        a2Var = a2.f49673e;
        return new c2(b2VarArr2, a2Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f49736g);
        if (this.f49734e && !this.f49735f) {
            c2 b10 = b();
            this.f49734e = false;
            c2 c2Var = this.d;
            if (c2Var != null) {
                b2[] b2VarArr = c2Var.f49721a;
                b2[] b2VarArr2 = b10.f49721a;
                if (b2VarArr.length == b2VarArr2.length) {
                    for (int i10 = 0; i10 < b2VarArr.length; i10++) {
                        if (b2VarArr[i10] == b2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            c2 c2Var2 = this.d;
            ArrayDeque arrayDeque = this.f49732b;
            arrayDeque.addLast(c2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f49733c.clear();
            this.d = b10;
            ((r3) this.f49731a.f25257b).f50016e3.S();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f49736g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f49735f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f49735f) {
            return;
        }
        this.f49734e = true;
        v1 v1Var = this.f49736g;
        AndroidUtilities.cancelRunOnUIThread(v1Var);
        AndroidUtilities.runOnUIThread(v1Var, 800L);
        ((r3) this.f49731a.f25257b).f50016e3.S();
    }

    public final void h() {
        if (this.f49735f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f49736g);
        this.f49734e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f49733c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f49732b.addLast(this.d);
        c2 c2Var = (c2) arrayDeque.removeLast();
        this.d = c2Var;
        a(c2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f49736g);
        this.f49732b.clear();
        this.f49733c.clear();
        this.d = b();
        this.f49734e = false;
        ((r3) this.f49731a.f25257b).f50016e3.S();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f49732b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f49733c.addLast(this.d);
        c2 c2Var = (c2) arrayDeque.removeLast();
        this.d = c2Var;
        a(c2Var);
    }
}
