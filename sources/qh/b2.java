package qh;

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
    public final n2.p f46304a;
    public boolean f46307e;
    public boolean f46308f;
    public final ArrayDeque f46305b = new ArrayDeque();
    public final ArrayDeque f46306c = new ArrayDeque();
    public final pf.o1 f46309g = new pf.o1(this, 6);
    public a2 d = b();

    public b2(n2.p pVar) {
        this.f46304a = pVar;
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
            int i9 = 0;
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
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.PageBlock pageBlock2 = arrayList.get(i10);
                    i10++;
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
                int i11 = 0;
                while (i11 < size2) {
                    TL_iv.pageTableRow pagetablerow = arrayList2.get(i11);
                    i11++;
                    TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                    if (pagetablerow2 != null) {
                        if (pagetablerow2.cells == null) {
                            pagetablerow2.cells = new ArrayList<>();
                        }
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                        int size3 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            TL_iv.pageTableCell pagetablecell = arrayList3.get(i12);
                            i12++;
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
                while (i9 < size4) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i9);
                    i9++;
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
                while (i9 < size5) {
                    TL_iv.PageBlock pageBlock3 = arrayList5.get(i9);
                    i9++;
                    e(pageBlock3);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                if (pageblockslideshow.items == null) {
                    pageblockslideshow.items = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
                int size6 = arrayList6.size();
                while (i9 < size6) {
                    TL_iv.PageBlock pageBlock4 = arrayList6.get(i9);
                    i9++;
                    e(pageBlock4);
                }
            }
        }
    }

    public final void a(qh.a2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: qh.b2.a(qh.a2):void");
    }

    public final a2 b() {
        y1 y1Var;
        i0 i0Var;
        int i9;
        ArrayList arrayList;
        z1[] z1VarArr;
        n2.p pVar = this.f46304a;
        ArrayList arrayList2 = ((o3) pVar.f18343b).f46573h3;
        HashMap hashMap = new HashMap();
        a2 a2Var = this.d;
        if (a2Var != null) {
            for (z1 z1Var : a2Var.f46289a) {
                hashMap.put(Long.valueOf(z1Var.f46860a), z1Var);
            }
        }
        z1[] z1VarArr2 = new z1[arrayList2.size()];
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            a aVar = (a) arrayList2.get(i10);
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            ArrayList arrayList3 = aVar.f46276k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            z1 z1Var2 = (z1) hashMap.get(Long.valueOf(aVar.f46268a));
            if (z1Var2 != null && z1Var2.f46862c == aVar.f46270c && z1Var2.d == aVar.d && z1Var2.f46863e == aVar.f46271e && z1Var2.f46864f == aVar.f46272f && z1Var2.f46865g == aVar.f46274i && z1Var2.h == aVar.f46273g) {
                ArrayList arrayList4 = z1Var2.f46866i;
                ArrayList arrayList5 = aVar.h;
                if (arrayList4 != arrayList5) {
                    if (arrayList4 != null && arrayList5 != null && arrayList4.size() == arrayList5.size()) {
                        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                            if (arrayList4.get(i11) != arrayList5.get(i11)) {
                                break;
                            }
                        }
                    }
                }
                if (z1Var2.f46867j.equals(arrayList3) && Arrays.equals(z1Var2.f46861b, byteArray)) {
                    z1VarArr2[i10] = z1Var2;
                }
            }
            long j10 = aVar.f46268a;
            int i12 = aVar.f46270c;
            int i13 = aVar.d;
            boolean z10 = aVar.f46271e;
            boolean z11 = aVar.f46272f;
            boolean z12 = aVar.f46274i;
            s sVar = aVar.f46273g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            z1VarArr2[i10] = new z1(j10, byteArray, i12, i13, z10, z11, z12, sVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((o3) pVar.f18343b).findFocus();
        if (findFocus instanceof d1) {
            d1 d1Var = (d1) findFocus;
            int selectionStart = d1Var.getSelectionStart();
            int selectionEnd = d1Var.getSelectionEnd();
            f5 U2 = o3.U2(d1Var);
            if (U2 != null && U2.getRow() != null) {
                if (d1Var == U2.getTitleEditText()) {
                    y1Var = new y1(U2.getRow().f46268a, 0, selectionStart, selectionEnd);
                } else {
                    i5 o6 = U2.o(d1Var);
                    if (o6 != null) {
                        i9 = U2.k(o6.f46449b);
                    } else {
                        i9 = -1;
                    }
                    y1Var = new y1(U2.getRow().f46268a, i9, selectionStart, selectionEnd);
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
                    y1Var = new y1(i0Var.getRow().f46268a, -1, selectionStart, selectionEnd);
                } else {
                    while (d1Var != 0 && !(d1Var instanceof s5)) {
                        ViewParent parent2 = d1Var.getParent();
                        if (parent2 instanceof View) {
                            d1Var = (View) parent2;
                        } else {
                            d1Var = 0;
                        }
                    }
                    if (d1Var instanceof s5) {
                        s5 s5Var = (s5) d1Var;
                        if (s5Var.getRow() != null) {
                            y1Var = new y1(s5Var.getRow().f46268a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new a2(z1VarArr2, y1Var);
        }
        y1Var = y1.f46841e;
        return new a2(z1VarArr2, y1Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f46309g);
        if (this.f46307e && !this.f46308f) {
            a2 b10 = b();
            this.f46307e = false;
            a2 a2Var = this.d;
            if (a2Var != null) {
                z1[] z1VarArr = a2Var.f46289a;
                z1[] z1VarArr2 = b10.f46289a;
                if (z1VarArr.length == z1VarArr2.length) {
                    for (int i9 = 0; i9 < z1VarArr.length; i9++) {
                        if (z1VarArr[i9] == z1VarArr2[i9]) {
                        }
                    }
                    return;
                }
            }
            a2 a2Var2 = this.d;
            ArrayDeque arrayDeque = this.f46305b;
            arrayDeque.addLast(a2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f46306c.clear();
            this.d = b10;
            ((o3) this.f46304a.f18343b).f46565d3.N1();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f46309g);
        c();
    }

    public final void f(int i9, int i10) {
        if (!this.f46308f) {
            if (i9 <= 16 && i10 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f46308f) {
            return;
        }
        this.f46307e = true;
        pf.o1 o1Var = this.f46309g;
        AndroidUtilities.cancelRunOnUIThread(o1Var);
        AndroidUtilities.runOnUIThread(o1Var, 800L);
        ((o3) this.f46304a.f18343b).f46565d3.N1();
    }

    public final void h() {
        if (this.f46308f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f46309g);
        this.f46307e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f46306c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f46305b.addLast(this.d);
        a2 a2Var = (a2) arrayDeque.removeLast();
        this.d = a2Var;
        a(a2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f46309g);
        this.f46305b.clear();
        this.f46306c.clear();
        this.d = b();
        this.f46307e = false;
        ((o3) this.f46304a.f18343b).f46565d3.N1();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f46305b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f46306c.addLast(this.d);
        a2 a2Var = (a2) arrayDeque.removeLast();
        this.d = a2Var;
        a(a2Var);
    }
}
