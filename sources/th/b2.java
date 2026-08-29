package th;

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
public final class b2 {
    public final o4.g f48362a;
    public boolean f48365e;
    public boolean f48366f;
    public final ArrayDeque f48363b = new ArrayDeque();
    public final ArrayDeque f48364c = new ArrayDeque();
    public final org.telegram.ui.web.t1 f48367g = new org.telegram.ui.web.t1(this, 27);
    public a2 d = b();

    public b2(o4.g gVar) {
        this.f48362a = gVar;
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

    public final void a(th.a2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: th.b2.a(th.a2):void");
    }

    public final a2 b() {
        y1 y1Var;
        i0 i0Var;
        int i10;
        ArrayList arrayList;
        z1[] z1VarArr;
        o4.g gVar = this.f48362a;
        ArrayList arrayList2 = ((p3) gVar.f19159b).f48646h3;
        HashMap hashMap = new HashMap();
        a2 a2Var = this.d;
        if (a2Var != null) {
            for (z1 z1Var : a2Var.f48348a) {
                hashMap.put(Long.valueOf(z1Var.f48913a), z1Var);
            }
        }
        z1[] z1VarArr2 = new z1[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            ArrayList arrayList3 = aVar.f48335k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            z1 z1Var2 = (z1) hashMap.get(Long.valueOf(aVar.f48327a));
            if (z1Var2 != null && z1Var2.f48915c == aVar.f48329c && z1Var2.d == aVar.d && z1Var2.f48916e == aVar.f48330e && z1Var2.f48917f == aVar.f48331f && z1Var2.f48918g == aVar.f48333i && z1Var2.h == aVar.f48332g) {
                ArrayList arrayList4 = z1Var2.f48919i;
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
                if (z1Var2.f48920j.equals(arrayList3) && Arrays.equals(z1Var2.f48914b, byteArray)) {
                    z1VarArr2[i11] = z1Var2;
                }
            }
            long j10 = aVar.f48327a;
            int i13 = aVar.f48329c;
            int i14 = aVar.d;
            boolean z10 = aVar.f48330e;
            boolean z11 = aVar.f48331f;
            boolean z12 = aVar.f48333i;
            s sVar = aVar.f48332g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            z1VarArr2[i11] = new z1(j10, byteArray, i13, i14, z10, z11, z12, sVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((p3) gVar.f19159b).findFocus();
        if (findFocus instanceof d1) {
            d1 d1Var = (d1) findFocus;
            int selectionStart = d1Var.getSelectionStart();
            int selectionEnd = d1Var.getSelectionEnd();
            g5 U2 = p3.U2(d1Var);
            if (U2 != null && U2.getRow() != null) {
                if (d1Var == U2.getTitleEditText()) {
                    y1Var = new y1(U2.getRow().f48327a, 0, selectionStart, selectionEnd);
                } else {
                    j5 o10 = U2.o(d1Var);
                    if (o10 != null) {
                        i10 = U2.k(o10.f48527b);
                    } else {
                        i10 = -1;
                    }
                    y1Var = new y1(U2.getRow().f48327a, i10, selectionStart, selectionEnd);
                }
            } else {
                if (d1Var instanceof i0) {
                    i0Var = (i0) d1Var;
                } else {
                    ViewParent parent = d1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof i0) {
                                i0Var = (i0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            i0Var = null;
                            break;
                        }
                    }
                }
                if (i0Var != null && i0Var.getRow() != null) {
                    y1Var = new y1(i0Var.getRow().f48327a, -1, selectionStart, selectionEnd);
                } else {
                    while (d1Var != 0 && !(d1Var instanceof t5)) {
                        ViewParent parent2 = d1Var.getParent();
                        if (parent2 instanceof View) {
                            d1Var = (View) parent2;
                        } else {
                            d1Var = 0;
                        }
                    }
                    if (d1Var instanceof t5) {
                        t5 t5Var = (t5) d1Var;
                        if (t5Var.getRow() != null) {
                            y1Var = new y1(t5Var.getRow().f48327a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new a2(z1VarArr2, y1Var);
        }
        y1Var = y1.f48899e;
        return new a2(z1VarArr2, y1Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f48367g);
        if (this.f48365e && !this.f48366f) {
            a2 b10 = b();
            this.f48365e = false;
            a2 a2Var = this.d;
            if (a2Var != null) {
                z1[] z1VarArr = a2Var.f48348a;
                z1[] z1VarArr2 = b10.f48348a;
                if (z1VarArr.length == z1VarArr2.length) {
                    for (int i10 = 0; i10 < z1VarArr.length; i10++) {
                        if (z1VarArr[i10] == z1VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            a2 a2Var2 = this.d;
            ArrayDeque arrayDeque = this.f48363b;
            arrayDeque.addLast(a2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f48364c.clear();
            this.d = b10;
            ((p3) this.f48362a.f19159b).f48638d3.s1();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f48367g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f48366f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f48366f) {
            return;
        }
        this.f48365e = true;
        org.telegram.ui.web.t1 t1Var = this.f48367g;
        AndroidUtilities.cancelRunOnUIThread(t1Var);
        AndroidUtilities.runOnUIThread(t1Var, 800L);
        ((p3) this.f48362a.f19159b).f48638d3.s1();
    }

    public final void h() {
        if (this.f48366f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f48367g);
        this.f48365e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f48364c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f48363b.addLast(this.d);
        a2 a2Var = (a2) arrayDeque.removeLast();
        this.d = a2Var;
        a(a2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f48367g);
        this.f48363b.clear();
        this.f48364c.clear();
        this.d = b();
        this.f48365e = false;
        ((p3) this.f48362a.f19159b).f48638d3.s1();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f48363b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f48364c.addLast(this.d);
        a2 a2Var = (a2) arrayDeque.removeLast();
        this.d = a2Var;
        a(a2Var);
    }
}
