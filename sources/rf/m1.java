package rf;

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
import f2.n1;
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k8;
import org.telegram.ui.Cells.p3;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vy;
public final class m1 extends il0 {
    public ImageView H;
    public TextView I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public String N;
    public final c6 P;
    public final Context d;
    public final g41 f47309e;
    public final TLRPC.StickerSetCovered[] f47310f;
    public final LongSparseArray h;
    public final LongSparseArray f47311n;
    public int f47316y;
    public final int f47308c = UserConfig.selectedAccount;
    public final SparseArray f47312r = new SparseArray();
    public final SparseArray f47313s = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseIntArray f47314w = new SparseIntArray();
    public final SparseArray f47315x = new SparseArray();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public final HashMap C = new HashMap();
    public final HashMap D = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList F = new ArrayList();
    public final SparseArray G = new SparseArray();
    public final l1 O = new l1(this);

    public m1(Context context, g41 g41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, c6 c6Var) {
        this.d = context;
        this.f47309e = g41Var;
        this.f47310f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.f47311n = longSparseArray2;
        this.P = c6Var;
    }

    @Override
    public final boolean D(n1 n1Var) {
        return false;
    }

    public final void E(p3 p3Var, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int indexOfIgnoreCase;
        p3 p3Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11 = this.f47308c;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f47313s.get(i10);
        boolean z17 = true;
        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f22419id))) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f47310f;
            if (i12 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i12] != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i12].set.f22419id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f22419id == stickerSetCovered.set.f22419id) {
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
        if (TextUtils.isEmpty(this.N)) {
            indexOfIgnoreCase = -1;
        } else {
            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.N);
        }
        if (indexOfIgnoreCase >= 0) {
            p3Var2 = p3Var;
            z13 = z10;
            p3Var2.c(stickerSetCovered, z11, z13, indexOfIgnoreCase, this.N.length(), z12);
        } else {
            p3Var2 = p3Var;
            z13 = z10;
            p3Var2.c(stickerSetCovered, z11, z13, 0, 0, z12);
            if (!TextUtils.isEmpty(this.N) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.N) == 0) {
                String str = stickerSetCovered.set.short_name;
                int length = this.N.length();
                p3Var2.B = str;
                p3Var2.C = length;
                p3Var2.f();
            }
        }
        if (z11) {
            mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f22419id);
        }
        long j10 = stickerSetCovered.set.f22419id;
        LongSparseArray longSparseArray = this.h;
        if (longSparseArray.indexOfKey(j10) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        long j11 = stickerSetCovered.set.f22419id;
        LongSparseArray longSparseArray2 = this.f47311n;
        if (longSparseArray2.indexOfKey(j11) >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 || z15) {
            if (z14 && p3Var2.f24966r) {
                longSparseArray.remove(stickerSetCovered.set.f22419id);
                z14 = false;
            } else if (z15 && !p3Var2.f24966r) {
                longSparseArray2.remove(stickerSetCovered.set.f22419id);
            }
        }
        if (!z12 && z14) {
            z16 = true;
        } else {
            z16 = false;
        }
        p3Var2.b(z16, z13);
        mediaDataController.preloadStickerSetThumb(stickerSetCovered);
        if (i10 <= 0) {
            z17 = false;
        }
        p3Var2.setNeedDivider(z17);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, org.telegram.ui.Cells.p3 r10) {
        throw new UnsupportedOperationException("Method not decompiled: rf.m1.F(org.telegram.tgnet.TLRPC$StickerSetCovered, org.telegram.ui.Cells.p3):void");
    }

    @Override
    public final int h() {
        return Math.max(1, this.f47316y + 1);
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0 && this.f47316y == 0) {
            return 5;
        }
        if (i10 == h() - 1) {
            return 4;
        }
        Object obj = this.f47313s.get(i10);
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
        g41 g41Var;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.f47312r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.f47314w;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.f47313s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.G;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.f47315x;
        sparseArray5.clear();
        this.f47316y = 0;
        ArrayList arrayList5 = this.A;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.B;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.F;
        int i12 = !arrayList7.isEmpty();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size + size2 + i12) {
            SparseArray sparseArray6 = this.v;
            g41 g41Var2 = this.f47309e;
            if (i13 < size2) {
                g41Var = g41Var2;
                ?? r6 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i13);
                i10 = size;
                arrayList3 = r6.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i11 = i12;
                stickerSetCovered = r6;
            } else {
                g41Var = g41Var2;
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
                        String str2 = (String) this.E.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.f47316y + i17, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i20 = 0;
                        while (i20 < size4) {
                            String str3 = str;
                            int i21 = this.f47316y + i17;
                            int i22 = size4;
                            int a2 = (i17 / g41Var.a()) + i14;
                            int i23 = i20;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i20);
                            sparseArray3.put(i21, document);
                            ArrayList arrayList9 = arrayList7;
                            int i24 = i17;
                            TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.f47308c).getStickerSetById(MediaDataController.getStickerSetId(document));
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
                    int ceil = (int) Math.ceil(i17 / g41Var.a());
                    for (int i25 = 0; i25 < ceil; i25++) {
                        sparseArray2.put(i14 + i25, Integer.valueOf(i17));
                    }
                    this.f47316y = (g41Var.a() * ceil) + this.f47316y;
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
                int ceil2 = (int) Math.ceil(arrayList3.size() / g41Var.a());
                sparseArray3.put(this.f47316y, stickerSetCovered);
                if (i13 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.f47316y, stickerSetCovered);
                }
                sparseIntArray.put(this.f47316y, i14);
                int size5 = arrayList3.size();
                int i26 = 0;
                while (i26 < size5) {
                    int i27 = i26 + 1;
                    int i28 = ceil2;
                    int i29 = this.f47316y + i27;
                    int a10 = i26 / g41Var.a();
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
                this.f47316y = (g41Var.a() * i30) + 1 + this.f47316y;
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
    public final void v(n1 n1Var, int i10) {
        int i11;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        SparseArray sparseArray = this.f47313s;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        E((p3) view, i10, false);
                        return;
                    }
                    return;
                }
                k8 k8Var = (k8) view;
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.N) && this.C.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            k8Var.b(0, stickerSet.title);
                        }
                        k8Var.d(this.N.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num = (Integer) this.D.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num != null) {
                        String str = stickerSet2.title;
                        int intValue = num.intValue();
                        if (!TextUtils.isEmpty(this.N)) {
                            i11 = this.N.length();
                        } else {
                            i11 = 0;
                        }
                        k8Var.c(str, 0, null, intValue, i11);
                    }
                    k8Var.d(0, null);
                    return;
                }
                return;
            }
            ((i3) view).setHeight(0);
            return;
        }
        ((b8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.v.get(i10), (String) this.f47315x.get(i10), false, false);
    }

    @Override
    public final void w(n1 n1Var, int i10, List list) {
        if (list.contains(0) && n1Var.f6436f == 3) {
            E((p3) n1Var.f6432a, i10, true);
        } else {
            v(n1Var, i10);
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        p3 p3Var;
        c6 c6Var = this.P;
        Context context = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                p3Var = null;
                            } else {
                                ?? linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(1);
                                linearLayout.setGravity(17);
                                ImageView imageView = new ImageView(context);
                                this.H = imageView;
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                this.H.setImageResource(R.drawable.stickers_empty);
                                ImageView imageView2 = this.H;
                                int i11 = g6.Le;
                                imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
                                linearLayout.addView(this.H, f6.n(-2, -2));
                                linearLayout.addView(new Space(context), f6.n(-1, 15));
                                TextView textView = new TextView(context);
                                this.I = textView;
                                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                                this.I.setTextSize(1, 16.0f);
                                this.I.setTextColor(g6.v0(i11, c6Var));
                                linearLayout.addView(this.I, f6.n(-2, -2));
                                linearLayout.setMinimumHeight(AndroidUtilities.dp(112.0f));
                                linearLayout.setLayoutParams(f6.c(-1.0f, -1));
                                p3Var = linearLayout;
                            }
                        } else {
                            p3Var = new View(context);
                        }
                    } else {
                        p3 p3Var2 = new p3(17, this.d, this.P, true, true);
                        p3Var2.setAddOnClickListener(new mh.n(this, 22));
                        p3Var = p3Var2;
                    }
                } else {
                    p3Var = new k8(this.d, false, true, this.P, false);
                }
            } else {
                p3Var = new i3(context);
            }
        } else {
            vy vyVar = new vy(3, context, c6Var, false);
            vyVar.getImageView().setLayerNum(3);
            p3Var = vyVar;
        }
        return new n1(p3Var);
    }
}
