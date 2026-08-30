package vh;

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
import ph.ga;
public final class c2 {
    public final ph.j5 f45832a;
    public boolean e;
    public boolean f45835f;
    public final ArrayDeque f45833b = new ArrayDeque();
    public final ArrayDeque f45834c = new ArrayDeque();
    public final ga f45836g = new ga(this, 29);
    public b2 d = b();

    public c2(ph.j5 j5Var) {
        this.f45832a = j5Var;
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

    public final void a(vh.b2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: vh.c2.a(vh.b2):void");
    }

    public final b2 b() {
        z1 z1Var;
        i0 i0Var;
        int i10;
        ArrayList arrayList;
        a2[] a2VarArr;
        ph.j5 j5Var = this.f45832a;
        ArrayList arrayList2 = ((r3) j5Var.f41782b).f46120i3;
        HashMap hashMap = new HashMap();
        b2 b2Var = this.d;
        if (b2Var != null) {
            for (a2 a2Var : b2Var.f45814a) {
                hashMap.put(Long.valueOf(a2Var.f45794a), a2Var);
            }
        }
        a2[] a2VarArr2 = new a2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f45775b;
            ArrayList arrayList3 = aVar.f45781k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            a2 a2Var2 = (a2) hashMap.get(Long.valueOf(aVar.f45774a));
            if (a2Var2 != null && a2Var2.f45796c == aVar.f45776c && a2Var2.d == aVar.d && a2Var2.e == aVar.e && a2Var2.f45797f == aVar.f45777f && a2Var2.f45798g == aVar.f45779i && a2Var2.h == aVar.f45778g) {
                ArrayList arrayList4 = a2Var2.f45799i;
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
                if (a2Var2.f45800j.equals(arrayList3) && Arrays.equals(a2Var2.f45795b, byteArray)) {
                    a2VarArr2[i11] = a2Var2;
                }
            }
            long j10 = aVar.f45774a;
            int i13 = aVar.f45776c;
            int i14 = aVar.d;
            boolean z4 = aVar.e;
            boolean z10 = aVar.f45777f;
            boolean z11 = aVar.f45779i;
            s sVar = aVar.f45778g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            a2VarArr2[i11] = new a2(j10, byteArray, i13, i14, z4, z10, z11, sVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((r3) j5Var.f41782b).findFocus();
        if (findFocus instanceof d1) {
            d1 d1Var = (d1) findFocus;
            int selectionStart = d1Var.getSelectionStart();
            int selectionEnd = d1Var.getSelectionEnd();
            i5 U2 = r3.U2(d1Var);
            if (U2 != null && U2.getRow() != null) {
                if (d1Var == U2.getTitleEditText()) {
                    z1Var = new z1(U2.getRow().f45774a, 0, selectionStart, selectionEnd);
                } else {
                    l5 o10 = U2.o(d1Var);
                    if (o10 != null) {
                        i10 = U2.k(o10.f46007b);
                    } else {
                        i10 = -1;
                    }
                    z1Var = new z1(U2.getRow().f45774a, i10, selectionStart, selectionEnd);
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
                    z1Var = new z1(i0Var.getRow().f45774a, -1, selectionStart, selectionEnd);
                } else {
                    while (d1Var != 0 && !(d1Var instanceof v5)) {
                        ViewParent parent2 = d1Var.getParent();
                        if (parent2 instanceof View) {
                            d1Var = (View) parent2;
                        } else {
                            d1Var = 0;
                        }
                    }
                    if (d1Var instanceof v5) {
                        v5 v5Var = (v5) d1Var;
                        if (v5Var.getRow() != null) {
                            z1Var = new z1(v5Var.getRow().f45774a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new b2(a2VarArr2, z1Var);
        }
        z1Var = z1.e;
        return new b2(a2VarArr2, z1Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f45836g);
        if (this.e && !this.f45835f) {
            b2 b10 = b();
            this.e = false;
            b2 b2Var = this.d;
            if (b2Var != null) {
                a2[] a2VarArr = b2Var.f45814a;
                a2[] a2VarArr2 = b10.f45814a;
                if (a2VarArr.length == a2VarArr2.length) {
                    for (int i10 = 0; i10 < a2VarArr.length; i10++) {
                        if (a2VarArr[i10] == a2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            b2 b2Var2 = this.d;
            ArrayDeque arrayDeque = this.f45833b;
            arrayDeque.addLast(b2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f45834c.clear();
            this.d = b10;
            ((r3) this.f45832a.f41782b).f46112e3.H();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f45836g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f45835f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f45835f) {
            return;
        }
        this.e = true;
        ga gaVar = this.f45836g;
        AndroidUtilities.cancelRunOnUIThread(gaVar);
        AndroidUtilities.runOnUIThread(gaVar, 800L);
        ((r3) this.f45832a.f41782b).f46112e3.H();
    }

    public final void h() {
        if (this.f45835f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f45836g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f45834c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f45833b.addLast(this.d);
        b2 b2Var = (b2) arrayDeque.removeLast();
        this.d = b2Var;
        a(b2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f45836g);
        this.f45833b.clear();
        this.f45834c.clear();
        this.d = b();
        this.e = false;
        ((r3) this.f45832a.f41782b).f46112e3.H();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f45833b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f45834c.addLast(this.d);
        b2 b2Var = (b2) arrayDeque.removeLast();
        this.d = b2Var;
        a(b2Var);
    }
}
