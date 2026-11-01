package zf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.o3;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.tk0;
import w7.b6;
public final class o1 extends tk0 {
    public int D;
    public ImageView L;
    public TextView M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public String R;
    public final p6 T;
    public final Context d;
    public final k41 e;
    public final TLRPC.StickerSetCovered[] f55618f;
    public final LongSparseArray h;
    public final LongSparseArray f55619n;
    public final int f55617c = e20.f15506s0;
    public final SparseArray f55620r = new SparseArray();
    public final SparseArray f55621s = new SparseArray();
    public final SparseArray f55622w = new SparseArray();
    public final SparseIntArray f55623x = new SparseIntArray();
    public final SparseArray f55624y = new SparseArray();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final HashMap G = new HashMap();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public final ArrayList J = new ArrayList();
    public final SparseArray K = new SparseArray();
    public final n1 S = new n1(this);

    public o1(Context context, k41 k41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, p6 p6Var) {
        this.d = context;
        this.e = k41Var;
        this.f55618f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.f55619n = longSparseArray2;
        this.T = p6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(w3 w3Var, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int A1;
        w3 w3Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11 = this.f55617c;
        vi b02 = vi.b0(i11);
        boolean z17 = false;
        ArrayList arrayList = b02.f18678u0[0];
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f55621s.get(i10);
        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSetCovered.set.f19821id))) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f55618f;
            if (i12 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i12] != null) {
                    TLRPC.TL_messages_stickerSet o02 = vi.b0(i11).o0(stickerSetCoveredArr[i12].set.f19821id);
                    if (o02 != null && !o02.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f19821id == stickerSetCovered.set.f19821id) {
                        z12 = true;
                        break;
                    }
                }
                i12++;
            } else {
                z12 = false;
                break;
            }
        }
        if (TextUtils.isEmpty(this.R)) {
            A1 = -1;
        } else {
            A1 = org.telegram.messenger.i0.A1(stickerSetCovered.set.title, this.R);
        }
        int i13 = A1;
        if (i13 >= 0) {
            w3Var2 = w3Var;
            z13 = z10;
            w3Var2.c(stickerSetCovered, z11, z13, i13, this.R.length(), z12);
        } else {
            w3Var2 = w3Var;
            z13 = z10;
            w3Var2.c(stickerSetCovered, z11, z13, 0, 0, z12);
            if (!TextUtils.isEmpty(this.R) && org.telegram.messenger.i0.A1(stickerSetCovered.set.short_name, this.R) == 0) {
                w3Var2.d(this.R.length(), stickerSetCovered.set.short_name);
            }
        }
        if (z11) {
            b02.e1(stickerSetCovered.set.f19821id);
        }
        long j10 = stickerSetCovered.set.f19821id;
        LongSparseArray longSparseArray = this.h;
        if (longSparseArray.indexOfKey(j10) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        long j11 = stickerSetCovered.set.f19821id;
        LongSparseArray longSparseArray2 = this.f55619n;
        if (longSparseArray2.indexOfKey(j11) >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 || z15) {
            if (z14 && w3Var2.f23387r) {
                longSparseArray.remove(stickerSetCovered.set.f19821id);
                z14 = false;
            } else if (z15 && !w3Var2.f23387r) {
                longSparseArray2.remove(stickerSetCovered.set.f19821id);
            }
        }
        if (!z12 && z14) {
            z16 = true;
        } else {
            z16 = false;
        }
        w3Var2.b(z16, z13);
        b02.p1(stickerSetCovered);
        if (i10 > 0) {
            z17 = true;
        }
        w3Var2.setNeedDivider(z17);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r8, org.telegram.ui.Cells.w3 r9) {
        throw new UnsupportedOperationException("Method not decompiled: zf.o1.F(org.telegram.tgnet.TLRPC$StickerSetCovered, org.telegram.ui.Cells.w3):void");
    }

    @Override
    public final int b() {
        return Math.max(1, this.D + 1);
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0 && this.D == 0) {
            return 5;
        }
        if (i10 == b() - 1) {
            return 4;
        }
        Object obj = this.f55621s.get(i10);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            return 3;
        }
        return 2;
    }

    @Override
    public final void f() {
        k41 k41Var;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.f55620r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.f55623x;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.f55621s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.K;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.f55624y;
        sparseArray5.clear();
        this.D = 0;
        ArrayList arrayList5 = this.E;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.F;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.J;
        int i12 = !arrayList7.isEmpty();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size + size2 + i12) {
            SparseArray sparseArray6 = this.f55622w;
            k41 k41Var2 = this.e;
            if (i13 < size2) {
                k41Var = k41Var2;
                ?? r62 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i13);
                i10 = size;
                arrayList3 = r62.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i11 = i12;
                stickerSetCovered = r62;
            } else {
                k41Var = k41Var2;
                i10 = size;
                int i15 = i13 - size2;
                if (i15 < i12) {
                    int size3 = arrayList7.size();
                    String str = "";
                    arrayList = arrayList6;
                    i11 = i12;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < size3) {
                        int i18 = size3;
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(i16);
                        int i19 = i16;
                        String str2 = (String) this.I.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.D + i17, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i20 = 0;
                        while (i20 < size4) {
                            String str3 = str;
                            int i21 = this.D + i17;
                            int i22 = size4;
                            int a2 = (i17 / k41Var.a()) + i14;
                            int i23 = i20;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i20);
                            sparseArray3.put(i21, document);
                            ArrayList arrayList9 = arrayList7;
                            int i24 = i17;
                            TLRPC.TL_messages_stickerSet o02 = vi.b0(this.f55617c).o0(vi.q0(document));
                            if (o02 != null) {
                                sparseArray6.put(i21, o02);
                            }
                            sparseIntArray.put(i21, a2);
                            i17 = i24 + 1;
                            i20 = i23 + 1;
                            str = str3;
                            size4 = i22;
                            arrayList7 = arrayList9;
                        }
                        i16 = i19 + 1;
                        size3 = i18;
                        sparseArray5 = sparseArray7;
                    }
                    sparseArray = sparseArray5;
                    arrayList2 = arrayList7;
                    int ceil = (int) Math.ceil(i17 / k41Var.a());
                    for (int i25 = 0; i25 < ceil; i25++) {
                        sparseArray2.put(i14 + i25, Integer.valueOf(i17));
                    }
                    this.D = (k41Var.a() * ceil) + this.D;
                    i14 += ceil;
                    arrayList4 = arrayList5;
                    i13++;
                    size = i10;
                    arrayList6 = arrayList;
                    i12 = i11;
                    sparseArray5 = sparseArray;
                    arrayList5 = arrayList4;
                    arrayList7 = arrayList2;
                } else {
                    sparseArray = sparseArray5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    i11 = i12;
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList5.get(i15 - i11);
                    arrayList3 = stickerSetCovered2.covers;
                    stickerSetCovered = stickerSetCovered2;
                }
            }
            if (!arrayList3.isEmpty()) {
                int ceil2 = (int) Math.ceil(arrayList3.size() / k41Var.a());
                sparseArray3.put(this.D, stickerSetCovered);
                if (i13 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.D, stickerSetCovered);
                }
                sparseIntArray.put(this.D, i14);
                int size5 = arrayList3.size();
                int i26 = 0;
                while (i26 < size5) {
                    int i27 = i26 + 1;
                    int i28 = ceil2;
                    int i29 = this.D + i27;
                    int a10 = i26 / k41Var.a();
                    ArrayList arrayList10 = arrayList5;
                    sparseArray3.put(i29, arrayList3.get(i26));
                    sparseArray6.put(i29, stickerSetCovered);
                    sparseIntArray.put(i29, a10 + i14 + 1);
                    if (i13 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                        sparseArray4.put(i29, stickerSetCovered);
                    }
                    i26 = i27;
                    ceil2 = i28;
                    arrayList5 = arrayList10;
                }
                int i30 = ceil2;
                arrayList4 = arrayList5;
                int i31 = i30 + 1;
                for (int i32 = 0; i32 < i31; i32++) {
                    sparseArray2.put(i14 + i32, stickerSetCovered);
                }
                this.D = (k41Var.a() * i30) + 1 + this.D;
                i14 += i31;
                i13++;
                size = i10;
                arrayList6 = arrayList;
                i12 = i11;
                sparseArray5 = sparseArray;
                arrayList5 = arrayList4;
                arrayList7 = arrayList2;
            }
            arrayList4 = arrayList5;
            i13++;
            size = i10;
            arrayList6 = arrayList;
            i12 = i11;
            sparseArray5 = sparseArray;
            arrayList5 = arrayList4;
            arrayList7 = arrayList2;
        }
        super.f();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        SparseArray sparseArray = this.f55621s;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        E((w3) view, i10, false);
                        return;
                    }
                    return;
                }
                n8 n8Var = (n8) view;
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.R) && this.G.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            n8Var.a(0, stickerSet.title);
                        }
                        n8Var.c(this.R.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num = (Integer) this.H.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num != null) {
                        String str = stickerSet2.title;
                        int intValue = num.intValue();
                        if (!TextUtils.isEmpty(this.R)) {
                            i11 = this.R.length();
                        } else {
                            i11 = 0;
                        }
                        n8Var.b(str, 0, null, intValue, i11);
                    }
                    n8Var.c(0, null);
                    return;
                }
                return;
            }
            ((o3) view).setHeight(0);
            return;
        }
        ((d8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f55622w.get(i10), (String) this.f55624y.get(i10), false, false);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10, List list) {
        if (list.contains(0) && c1Var.f47912f == 3) {
            E((w3) c1Var.f47909a, i10, true);
        } else {
            t(c1Var, i10);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        w3 w3Var;
        p6 p6Var = this.T;
        Context context = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            w3Var = null;
                            if (i10 == 5) {
                                ?? linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(1);
                                linearLayout.setGravity(17);
                                ImageView imageView = new ImageView(context);
                                this.L = imageView;
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                this.L.setImageResource(2131232758);
                                ImageView imageView2 = this.L;
                                int i11 = t6.Af;
                                a7.t(imageView2, i11, p6Var, PorterDuff.Mode.MULTIPLY);
                                linearLayout.addView(this.L, b6.o(-2, -2));
                                linearLayout.addView(new Space(context), b6.o(-1, 15));
                                TextView textView = new TextView(context);
                                this.M = textView;
                                textView.setText(dd.L0(2131748165, null));
                                this.M.setTextSize(1, 16.0f);
                                a7.V(this.M, i11, p6Var);
                                linearLayout.addView(this.M, b6.o(-2, -2));
                                linearLayout.setMinimumHeight(org.telegram.messenger.i0.L(112.0f));
                                linearLayout.setLayoutParams(b6.c(-1.0f, -1));
                                w3Var = linearLayout;
                            }
                        } else {
                            w3Var = new View(context);
                        }
                    } else {
                        w3 w3Var2 = new w3(17, this.d, this.T, true, true);
                        w3Var2.setAddOnClickListener(new f(this, 3));
                        w3Var = w3Var2;
                    }
                } else {
                    w3Var = new n8(this.d, false, true, this.T, false);
                }
            } else {
                w3Var = new o3(context);
            }
        } else {
            my myVar = new my(3, context, p6Var, false);
            myVar.getImageView().E0(3);
            w3Var = myVar;
        }
        return new s4.c1(w3Var);
    }
}
