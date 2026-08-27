package rh;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

public final class b2 {

    public final n2.b0 f47062a;

    public boolean f47065e;

    public boolean f47066f;

    public final ArrayDeque f47063b = new ArrayDeque();

    public final ArrayDeque f47064c = new ArrayDeque();

    public final qf.b f47067g = new qf.b(this, 13);
    public a2 d = b();

    public b2(n2.b0 b0Var) {
        this.f47062a = b0Var;
    }

    public static void e(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
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
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
            if (pageblockmath.source == null) {
                pageblockmath.source = "";
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            if (pageblockmap.geo == null) {
                pageblockmap.geo = new TLRPC.TL_geoPointEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
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
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
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
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
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
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
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

    public final void a(a2 a2Var) {
        TL_iv.PageBlock pageblockparagraph;
        this.f47065e = false;
        boolean z10 = true;
        this.f47066f = true;
        ArrayList arrayList = new ArrayList(a2Var.f47048a.length);
        z1[] z1VarArr = a2Var.f47048a;
        int length = z1VarArr.length;
        int i10 = 0;
        while (i10 < length) {
            z1 z1Var = z1VarArr[i10];
            byte[] bArr = z1Var.f47616b;
            ArrayList arrayList2 = z1Var.f47621i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageblockparagraph = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z10), z10);
                serializedData.cleanup();
                if (pageblockparagraph == null) {
                    pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = new TL_iv.textEmpty();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
            a aVar = new a(pageblockparagraph, z1Var.f47617c, z1Var.d, z1Var.f47615a);
            aVar.f47030e = z1Var.f47618e;
            aVar.f47031f = z1Var.f47619f;
            aVar.f47033i = z1Var.f47620g;
            aVar.f47032g = z1Var.h;
            aVar.h = arrayList2 != null ? new ArrayList(arrayList2) : null;
            aVar.f47035k.addAll(z1Var.f47622j);
            arrayList.add(aVar);
            i10++;
            z10 = true;
        }
        y1 y1Var = a2Var.f47049b;
        n2.b0 b0Var = this.f47062a;
        p3 p3Var = (p3) b0Var.f18130b;
        p3Var.f47352j3.f(false);
        ArrayList arrayList3 = p3Var.f47348h3;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        p3Var.s4();
        p3Var.U2.N(false);
        if (y1Var.f47602a >= 0) {
            p3Var.post(new o2(0, p3Var, y1Var));
        }
        p3Var.f47340d3.onContentChanged();
        this.f47066f = false;
        ((p3) b0Var.f18130b).f47340d3.J1();
    }

    public final a2 b() {
        y1 y1Var;
        i0 i0Var;
        ArrayList arrayList;
        n2.b0 b0Var = this.f47062a;
        ArrayList arrayList2 = ((p3) b0Var.f18130b).f47348h3;
        HashMap map = new HashMap();
        a2 a2Var = this.d;
        if (a2Var != null) {
            for (z1 z1Var : a2Var.f47048a) {
                map.put(Long.valueOf(z1Var.f47615a), z1Var);
            }
        }
        z1[] z1VarArr = new z1[arrayList2.size()];
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            a aVar = (a) arrayList2.get(i10);
            TL_iv.PageBlock pageBlock = aVar.f47028b;
            ArrayList arrayList3 = aVar.f47035k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            z1 z1Var2 = (z1) map.get(Long.valueOf(aVar.f47027a));
            if (z1Var2 != null && z1Var2.f47617c == aVar.f47029c && z1Var2.d == aVar.d && z1Var2.f47618e == aVar.f47030e && z1Var2.f47619f == aVar.f47031f && z1Var2.f47620g == aVar.f47033i && z1Var2.h == aVar.f47032g) {
                ArrayList arrayList4 = z1Var2.f47621i;
                ArrayList arrayList5 = aVar.h;
                if (arrayList4 != arrayList5) {
                    if (arrayList4 != null && arrayList5 != null && arrayList4.size() == arrayList5.size()) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList4.size()) {
                                if (arrayList4.get(i11) == arrayList5.get(i11)) {
                                    i11++;
                                }
                            } else if (z1Var2.f47622j.equals(arrayList3) && Arrays.equals(z1Var2.f47616b, byteArray)) {
                                z1VarArr[i10] = z1Var2;
                            }
                        }
                    }
                    long j10 = aVar.f47027a;
                    int i12 = aVar.f47029c;
                    int i13 = aVar.d;
                    boolean z10 = aVar.f47030e;
                    boolean z11 = aVar.f47031f;
                    boolean z12 = aVar.f47033i;
                    s sVar = aVar.f47032g;
                    if (aVar.h != null) {
                        arrayList = new ArrayList(aVar.h);
                    } else {
                        arrayList = null;
                    }
                    z1VarArr[i10] = new z1(j10, byteArray, i12, i13, z10, z11, z12, sVar, arrayList, new ArrayList(arrayList3));
                } else if (z1Var2.f47622j.equals(arrayList3)) {
                    long j11 = aVar.f47027a;
                    int i14 = aVar.f47029c;
                    int i15 = aVar.d;
                    boolean z13 = aVar.f47030e;
                    boolean z14 = aVar.f47031f;
                    boolean z15 = aVar.f47033i;
                    s sVar2 = aVar.f47032g;
                    if (aVar.h != null) {
                        arrayList = new ArrayList(aVar.h);
                    } else {
                        arrayList = null;
                    }
                    z1VarArr[i10] = new z1(j11, byteArray, i14, i15, z13, z14, z15, sVar2, arrayList, new ArrayList(arrayList3));
                } else {
                    long j12 = aVar.f47027a;
                    int i16 = aVar.f47029c;
                    int i17 = aVar.d;
                    boolean z16 = aVar.f47030e;
                    boolean z17 = aVar.f47031f;
                    boolean z18 = aVar.f47033i;
                    s sVar3 = aVar.f47032g;
                    if (aVar.h != null) {
                        arrayList = new ArrayList(aVar.h);
                    } else {
                        arrayList = null;
                    }
                    z1VarArr[i10] = new z1(j12, byteArray, i16, i17, z16, z17, z18, sVar3, arrayList, new ArrayList(arrayList3));
                }
            } else {
                long j13 = aVar.f47027a;
                int i18 = aVar.f47029c;
                int i19 = aVar.d;
                boolean z19 = aVar.f47030e;
                boolean z110 = aVar.f47031f;
                boolean z111 = aVar.f47033i;
                s sVar4 = aVar.f47032g;
                if (aVar.h != null) {
                    arrayList = new ArrayList(aVar.h);
                } else {
                    arrayList = null;
                }
                z1VarArr[i10] = new z1(j13, byteArray, i18, i19, z19, z110, z111, sVar4, arrayList, new ArrayList(arrayList3));
            }
        }
        View viewFindFocus = ((p3) b0Var.f18130b).findFocus();
        if (viewFindFocus instanceof d1) {
            ?? r10 = (d1) viewFindFocus;
            int selectionStart = r10.getSelectionStart();
            int selectionEnd = r10.getSelectionEnd();
            ?? U2 = p3.U2(r10);
            if (U2 == 0 || U2.getRow() == null) {
                if (!(r10 instanceof i0)) {
                    ViewParent parent = r10.getParent();
                    while (true) {
                        if (parent == null) {
                            i0Var = null;
                            break;
                        }
                        if (parent instanceof i0) {
                            i0Var = (i0) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                } else {
                    i0Var = (i0) r10;
                }
                if (i0Var == null || i0Var.getRow() == null) {
                    while (r10 != 0 && !(r10 instanceof t5)) {
                        Object parent2 = r10.getParent();
                        r10 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r10 instanceof t5) {
                        t5 t5Var = (t5) r10;
                        if (t5Var.getRow() != null) {
                            y1Var = new y1(t5Var.getRow().f47027a, -1, selectionStart, selectionEnd);
                        } else {
                            y1Var = y1.f47601e;
                        }
                    } else {
                        y1Var = y1.f47601e;
                    }
                } else {
                    y1Var = new y1(i0Var.getRow().f47027a, -1, selectionStart, selectionEnd);
                }
            } else if (r10 == U2.getTitleEditText()) {
                y1Var = new y1(U2.getRow().f47027a, 0, selectionStart, selectionEnd);
            } else {
                j5 j5VarO = U2.o(r10);
                y1Var = new y1(U2.getRow().f47027a, j5VarO != null ? U2.k(j5VarO.f47227b) : -1, selectionStart, selectionEnd);
            }
        } else {
            y1Var = y1.f47601e;
        }
        return new a2(z1VarArr, y1Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f47067g);
        if (!this.f47065e || this.f47066f) {
            return;
        }
        a2 a2VarB = b();
        this.f47065e = false;
        a2 a2Var = this.d;
        if (a2Var != null) {
            z1[] z1VarArr = a2Var.f47048a;
            z1[] z1VarArr2 = a2VarB.f47048a;
            if (z1VarArr.length == z1VarArr2.length) {
                for (int i10 = 0; i10 < z1VarArr.length; i10++) {
                    if (z1VarArr[i10] == z1VarArr2[i10]) {
                    }
                }
                return;
            }
        }
        a2 a2Var2 = this.d;
        ArrayDeque arrayDeque = this.f47063b;
        arrayDeque.addLast(a2Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.f47064c.clear();
        this.d = a2VarB;
        ((p3) this.f47062a.f18130b).f47340d3.J1();
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f47067g);
        c();
    }

    public final void f(int i10, int i11) {
        if (this.f47066f) {
            return;
        }
        if (i10 > 16 || i11 > 16) {
            d();
        }
    }

    public final void g() {
        if (this.f47066f) {
            return;
        }
        this.f47065e = true;
        qf.b bVar = this.f47067g;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 800L);
        ((p3) this.f47062a.f18130b).f47340d3.J1();
    }

    public final void h() {
        if (this.f47066f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f47067g);
        this.f47065e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f47064c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f47063b.addLast(this.d);
        a2 a2Var = (a2) arrayDeque.removeLast();
        this.d = a2Var;
        a(a2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f47067g);
        this.f47063b.clear();
        this.f47064c.clear();
        this.d = b();
        this.f47065e = false;
        ((p3) this.f47062a.f18130b).f47340d3.J1();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f47063b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f47064c.addLast(this.d);
        a2 a2Var = (a2) arrayDeque.removeLast();
        this.d = a2Var;
        a(a2Var);
    }
}
