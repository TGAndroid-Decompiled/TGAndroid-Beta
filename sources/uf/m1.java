package uf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t41;
public final class m1 extends sl0 {
    public ImageView I;
    public TextView J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public String O;
    public final g6 Q;
    public final Context d;
    public final t41 f48647e;
    public final TLRPC.StickerSetCovered[] f48648f;
    public final LongSparseArray h;
    public final LongSparseArray f48649n;
    public int f48654y;
    public final int f48646c = UserConfig.selectedAccount;
    public final SparseArray f48650r = new SparseArray();
    public final SparseArray f48651s = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseIntArray f48652w = new SparseIntArray();
    public final SparseArray f48653x = new SparseArray();
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public final HashMap D = new HashMap();
    public final HashMap E = new HashMap();
    public final HashMap F = new HashMap();
    public final ArrayList G = new ArrayList();
    public final SparseArray H = new SparseArray();
    public final l1 P = new l1(this);

    public m1(Context context, t41 t41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, g6 g6Var) {
        this.d = context;
        this.f48647e = t41Var;
        this.f48648f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.f48649n = longSparseArray2;
        this.Q = g6Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    public final void E(r3 r3Var, int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int indexOfIgnoreCase;
        r3 r3Var2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11 = this.f48646c;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f48651s.get(i10);
        boolean z16 = true;
        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f20870id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f48648f;
            if (i12 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i12] != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i12].set.f20870id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f20870id == stickerSetCovered.set.f20870id) {
                        z11 = true;
                        break;
                    }
                }
                i12++;
            } else {
                z11 = false;
                break;
            }
        }
        if (TextUtils.isEmpty(this.O)) {
            indexOfIgnoreCase = -1;
        } else {
            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.O);
        }
        if (indexOfIgnoreCase >= 0) {
            r3Var2 = r3Var;
            z12 = z4;
            r3Var2.c(stickerSetCovered, z10, z12, indexOfIgnoreCase, this.O.length(), z11);
        } else {
            r3Var2 = r3Var;
            z12 = z4;
            r3Var2.c(stickerSetCovered, z10, z12, 0, 0, z11);
            if (!TextUtils.isEmpty(this.O) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.O) == 0) {
                String str = stickerSetCovered.set.short_name;
                int length = this.O.length();
                r3Var2.C = str;
                r3Var2.D = length;
                r3Var2.f();
            }
        }
        if (z10) {
            mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f20870id);
        }
        long j10 = stickerSetCovered.set.f20870id;
        LongSparseArray longSparseArray = this.h;
        if (longSparseArray.indexOfKey(j10) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        long j11 = stickerSetCovered.set.f20870id;
        LongSparseArray longSparseArray2 = this.f48649n;
        if (longSparseArray2.indexOfKey(j11) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 || z14) {
            if (z13 && r3Var2.f23549r) {
                longSparseArray.remove(stickerSetCovered.set.f20870id);
                z13 = false;
            } else if (z14 && !r3Var2.f23549r) {
                longSparseArray2.remove(stickerSetCovered.set.f20870id);
            }
        }
        if (!z11 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        r3Var2.b(z15, z12);
        mediaDataController.preloadStickerSetThumb(stickerSetCovered);
        if (i10 <= 0) {
            z16 = false;
        }
        r3Var2.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, org.telegram.ui.Cells.r3 r10) {
        throw new UnsupportedOperationException("Method not decompiled: uf.m1.F(org.telegram.tgnet.TLRPC$StickerSetCovered, org.telegram.ui.Cells.r3):void");
    }

    @Override
    public final int h() {
        return Math.max(1, this.f48654y + 1);
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0 && this.f48654y == 0) {
            return 5;
        }
        if (i10 == h() - 1) {
            return 4;
        }
        Object obj = this.f48651s.get(i10);
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
    public final void l() {
        t41 t41Var;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.f48650r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.f48652w;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.f48651s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.H;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.f48653x;
        sparseArray5.clear();
        this.f48654y = 0;
        ArrayList arrayList5 = this.B;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.C;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.G;
        int i12 = !arrayList7.isEmpty();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size + size2 + i12) {
            SparseArray sparseArray6 = this.v;
            t41 t41Var2 = this.f48647e;
            if (i13 < size2) {
                t41Var = t41Var2;
                ?? r62 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i13);
                i10 = size;
                arrayList3 = r62.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i11 = i12;
                stickerSetCovered = r62;
            } else {
                t41Var = t41Var2;
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
                        String str2 = (String) this.F.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.f48654y + i17, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i20 = 0;
                        while (i20 < size4) {
                            String str3 = str;
                            int i21 = this.f48654y + i17;
                            int i22 = size4;
                            int a2 = (i17 / t41Var.a()) + i14;
                            int i23 = i20;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i20);
                            sparseArray3.put(i21, document);
                            ArrayList arrayList9 = arrayList7;
                            int i24 = i17;
                            TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.f48646c).getStickerSetById(MediaDataController.getStickerSetId(document));
                            if (stickerSetById != null) {
                                sparseArray6.put(i21, stickerSetById);
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
                    int ceil = (int) Math.ceil(i17 / t41Var.a());
                    for (int i25 = 0; i25 < ceil; i25++) {
                        sparseArray2.put(i14 + i25, Integer.valueOf(i17));
                    }
                    this.f48654y = (t41Var.a() * ceil) + this.f48654y;
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
                int ceil2 = (int) Math.ceil(arrayList3.size() / t41Var.a());
                sparseArray3.put(this.f48654y, stickerSetCovered);
                if (i13 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.f48654y, stickerSetCovered);
                }
                sparseIntArray.put(this.f48654y, i14);
                int size5 = arrayList3.size();
                int i26 = 0;
                while (i26 < size5) {
                    int i27 = i26 + 1;
                    int i28 = ceil2;
                    int i29 = this.f48654y + i27;
                    int a10 = i26 / t41Var.a();
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
                this.f48654y = (t41Var.a() * i30) + 1 + this.f48654y;
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
        super.l();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        SparseArray sparseArray = this.f48651s;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        E((r3) view, i10, false);
                        return;
                    }
                    return;
                }
                m8 m8Var = (m8) view;
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.O) && this.D.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            m8Var.b(0, stickerSet.title);
                        }
                        m8Var.d(this.O.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num = (Integer) this.E.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num != null) {
                        String str = stickerSet2.title;
                        int intValue = num.intValue();
                        if (!TextUtils.isEmpty(this.O)) {
                            i11 = this.O.length();
                        } else {
                            i11 = 0;
                        }
                        m8Var.c(str, 0, null, intValue, i11);
                    }
                    m8Var.d(0, null);
                    return;
                }
                return;
            }
            ((k3) view).setHeight(0);
            return;
        }
        ((d8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.v.get(i10), (String) this.f48653x.get(i10), false, false);
    }

    @Override
    public final void w(f2.m1 m1Var, int i10, List list) {
        if (list.contains(0) && m1Var.f5879f == 3) {
            E((r3) m1Var.f5875a, i10, true);
        } else {
            v(m1Var, i10);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        r3 r3Var;
        g6 g6Var = this.Q;
        Context context = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                r3Var = null;
                            } else {
                                ?? linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(1);
                                linearLayout.setGravity(17);
                                ImageView imageView = new ImageView(context);
                                this.I = imageView;
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                this.I.setImageResource(R.drawable.stickers_empty);
                                ImageView imageView2 = this.I;
                                int i11 = k6.Le;
                                imageView2.setColorFilter(new PorterDuffColorFilter(k6.v0(i11, g6Var), PorterDuff.Mode.MULTIPLY));
                                linearLayout.addView(this.I, c6.n(-2, -2));
                                linearLayout.addView(new Space(context), c6.n(-1, 15));
                                TextView textView = new TextView(context);
                                this.J = textView;
                                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                                this.J.setTextSize(1, 16.0f);
                                this.J.setTextColor(k6.v0(i11, g6Var));
                                linearLayout.addView(this.J, c6.n(-2, -2));
                                linearLayout.setMinimumHeight(AndroidUtilities.dp(112.0f));
                                linearLayout.setLayoutParams(c6.c(-1.0f, -1));
                                r3Var = linearLayout;
                            }
                        } else {
                            r3Var = new View(context);
                        }
                    } else {
                        r3 r3Var2 = new r3(17, this.d, this.Q, true, true);
                        r3Var2.setAddOnClickListener(new org.telegram.ui.Components.voip.o(this, 22));
                        r3Var = r3Var2;
                    }
                } else {
                    r3Var = new m8(this.d, false, true, this.Q, false);
                }
            } else {
                r3Var = new k3(context);
            }
        } else {
            cz czVar = new cz(3, context, g6Var, false);
            czVar.getImageView().setLayerNum(3);
            r3Var = czVar;
        }
        return new f2.m1(r3Var);
    }
}
