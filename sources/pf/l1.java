package pf;

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
import f2.o1;
import h7.z5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.j8;
import org.telegram.ui.Cells.p3;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.yk0;

public final class l1 extends yk0 {
    public ImageView H;
    public TextView I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public String N;
    public final c6 P;
    public final Context d;

    public final x31 f45868e;

    public final TLRPC.StickerSetCovered[] f45869f;
    public final LongSparseArray h;

    public final LongSparseArray f45870n;

    public int f45875y;

    public final int f45867c = UserConfig.selectedAccount;

    public final SparseArray f45871r = new SparseArray();

    public final SparseArray f45872s = new SparseArray();
    public final SparseArray v = new SparseArray();

    public final SparseIntArray f45873w = new SparseIntArray();

    public final SparseArray f45874x = new SparseArray();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public final HashMap C = new HashMap();
    public final HashMap D = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList F = new ArrayList();
    public final SparseArray G = new SparseArray();
    public final k1 O = new k1(this);

    public l1(Context context, x31 x31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, c6 c6Var) {
        this.d = context;
        this.f45868e = x31Var;
        this.f45869f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.f45870n = longSparseArray2;
        this.P = c6Var;
    }

    @Override
    public final boolean D(o1 o1Var) {
        return false;
    }

    public final void E(p3 p3Var, int i10, boolean z10) {
        boolean z11;
        p3 p3Var2;
        boolean z12;
        int i11 = this.f45867c;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f45872s.get(i10);
        boolean z13 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f22407id));
        int i12 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f45869f;
            if (i12 >= stickerSetCoveredArr.length) {
                z11 = false;
                break;
            }
            if (stickerSetCoveredArr[i12] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i12].set.f22407id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i12] = null;
                } else if (stickerSetCoveredArr[i12].set.f22407id == stickerSetCovered.set.f22407id) {
                    z11 = true;
                    break;
                }
            }
            i12++;
        }
        int iIndexOfIgnoreCase = TextUtils.isEmpty(this.N) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.N);
        if (iIndexOfIgnoreCase >= 0) {
            p3Var2 = p3Var;
            z12 = z10;
            p3Var2.c(stickerSetCovered, z13, z12, iIndexOfIgnoreCase, this.N.length(), z11);
        } else {
            p3Var2 = p3Var;
            z12 = z10;
            p3Var2.c(stickerSetCovered, z13, z12, 0, 0, z11);
            if (!TextUtils.isEmpty(this.N) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.N) == 0) {
                String str = stickerSetCovered.set.short_name;
                int length = this.N.length();
                p3Var2.B = str;
                p3Var2.C = length;
                p3Var2.f();
            }
        }
        if (z13) {
            mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f22407id);
        }
        long j10 = stickerSetCovered.set.f22407id;
        LongSparseArray longSparseArray = this.h;
        boolean z14 = longSparseArray.indexOfKey(j10) >= 0;
        long j11 = stickerSetCovered.set.f22407id;
        LongSparseArray longSparseArray2 = this.f45870n;
        boolean z15 = longSparseArray2.indexOfKey(j11) >= 0;
        if (z14 || z15) {
            if (z14 && p3Var2.f24975r) {
                longSparseArray.remove(stickerSetCovered.set.f22407id);
                z14 = false;
            } else if (z15 && !p3Var2.f24975r) {
                longSparseArray2.remove(stickerSetCovered.set.f22407id);
            }
        }
        p3Var2.b(!z11 && z14, z12);
        mediaDataController.preloadStickerSetThumb(stickerSetCovered);
        p3Var2.setNeedDivider(i10 > 0);
    }

    public final void F(TLRPC.StickerSetCovered stickerSetCovered, p3 p3Var) {
        TLRPC.StickerSetCovered[] stickerSetCoveredArr;
        boolean z10;
        int i10 = 0;
        while (true) {
            stickerSetCoveredArr = this.f45869f;
            if (i10 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i10] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.f45867c).getStickerSetById(stickerSetCoveredArr[i10].set.f22407id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i10] = null;
                    break;
                } else if (stickerSetCoveredArr[i10].set.f22407id == stickerSetCovered.set.f22407id) {
                    return;
                }
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= stickerSetCoveredArr.length) {
                z10 = false;
                break;
            } else {
                if (stickerSetCoveredArr[i11] == null) {
                    stickerSetCoveredArr[i11] = stickerSetCovered;
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (!z10 && p3Var != null) {
            p3Var.b(true, true);
        }
        this.h.put(stickerSetCovered.set.f22407id, stickerSetCovered);
        if (p3Var != null) {
            this.f45868e.f34462a.g(p3Var.getStickerSet(), z10);
            return;
        }
        SparseArray sparseArray = this.G;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) sparseArray.get(i12);
            if (stickerSetCovered2 != null && stickerSetCovered2.set.f22407id == stickerSetCovered.set.f22407id) {
                n(i12, 0);
                return;
            }
        }
    }

    @Override
    public final int h() {
        return Math.max(1, this.f45875y + 1);
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0 && this.f45875y == 0) {
            return 5;
        }
        if (i10 == h() - 1) {
            return 4;
        }
        Object obj = this.f45872s.get(i10);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
    }

    @Override
    public final void l() {
        x31 x31Var;
        int i10;
        int i11;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList arrayList2;
        Object obj;
        SparseArray sparseArray = this.f45871r;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.f45873w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f45872s;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.G;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.f45874x;
        sparseArray4.clear();
        this.f45875y = 0;
        ArrayList arrayList3 = this.A;
        int size = arrayList3.size();
        ArrayList arrayList4 = this.B;
        int size2 = arrayList4.size();
        ArrayList arrayList5 = this.F;
        int i12 = !arrayList5.isEmpty() ? 1 : 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size + size2 + i12) {
            SparseArray sparseArray5 = this.v;
            x31 x31Var2 = this.f45868e;
            if (i13 < size2) {
                x31Var = x31Var2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                i10 = size;
                arrayList = tL_messages_stickerSet.documents;
                i11 = i12;
                obj = tL_messages_stickerSet;
            } else {
                x31Var = x31Var2;
                i10 = size;
                int i15 = i13 - size2;
                if (i15 < i12) {
                    int size3 = arrayList5.size();
                    String str = "";
                    arrayList4 = arrayList4;
                    i11 = i12;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < size3) {
                        int i18 = size3;
                        ArrayList arrayList6 = (ArrayList) arrayList5.get(i16);
                        int i19 = i16;
                        String str2 = (String) this.E.get(arrayList6);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray4.put(this.f45875y + i17, str2);
                            str = str2;
                        }
                        int size4 = arrayList6.size();
                        SparseArray sparseArray6 = sparseArray4;
                        int i20 = 0;
                        while (i20 < size4) {
                            String str3 = str;
                            int i21 = this.f45875y + i17;
                            int i22 = size4;
                            int iA = (i17 / x31Var.a()) + i14;
                            int i23 = i20;
                            TLRPC.Document document = (TLRPC.Document) arrayList6.get(i20);
                            sparseArray2.put(i21, document);
                            ArrayList arrayList7 = arrayList5;
                            int i24 = i17;
                            TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.f45867c).getStickerSetById(MediaDataController.getStickerSetId(document));
                            if (stickerSetById != null) {
                                sparseArray5.put(i21, stickerSetById);
                            }
                            sparseIntArray.put(i21, iA);
                            i17 = i24 + 1;
                            i20 = i23 + 1;
                            str = str3;
                            size4 = i22;
                            arrayList5 = arrayList7;
                        }
                        i16 = i19 + 1;
                        size3 = i18;
                        sparseArray4 = sparseArray6;
                    }
                    sparseArray4 = sparseArray4;
                    arrayList5 = arrayList5;
                    int iCeil = (int) Math.ceil(i17 / x31Var.a());
                    for (int i25 = 0; i25 < iCeil; i25++) {
                        sparseArray.put(i14 + i25, Integer.valueOf(i17));
                    }
                    this.f45875y = (x31Var.a() * iCeil) + this.f45875y;
                    i14 += iCeil;
                } else {
                    i11 = i12;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i15 - i11);
                    arrayList = stickerSetCovered.covers;
                    obj = stickerSetCovered;
                }
                arrayList2 = arrayList3;
                i13++;
                size = i10;
                arrayList4 = arrayList4;
                i12 = i11;
                sparseArray4 = sparseArray4;
                arrayList3 = arrayList2;
                arrayList5 = arrayList5;
            }
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                int iCeil2 = (int) Math.ceil(arrayList.size() / x31Var.a());
                sparseArray2.put(this.f45875y, obj);
                if (i13 >= size2 && (obj instanceof TLRPC.StickerSetCovered)) {
                    sparseArray3.put(this.f45875y, (TLRPC.StickerSetCovered) obj);
                }
                sparseIntArray.put(this.f45875y, i14);
                int size5 = arrayList.size();
                int i26 = 0;
                while (i26 < size5) {
                    int i27 = i26 + 1;
                    int i28 = iCeil2;
                    int i29 = this.f45875y + i27;
                    int iA2 = i26 / x31Var.a();
                    ArrayList arrayList8 = arrayList3;
                    sparseArray2.put(i29, arrayList.get(i26));
                    sparseArray5.put(i29, obj);
                    sparseIntArray.put(i29, iA2 + i14 + 1);
                    if (i13 >= size2 && (obj instanceof TLRPC.StickerSetCovered)) {
                        sparseArray3.put(i29, (TLRPC.StickerSetCovered) obj);
                    }
                    i26 = i27;
                    iCeil2 = i28;
                    arrayList3 = arrayList8;
                }
                int i30 = iCeil2;
                arrayList2 = arrayList3;
                int i31 = i30 + 1;
                for (int i32 = 0; i32 < i31; i32++) {
                    sparseArray.put(i14 + i32, obj);
                }
                this.f45875y = (x31Var.a() * i30) + 1 + this.f45875y;
                i14 += i31;
            }
            i13++;
            size = i10;
            arrayList4 = arrayList4;
            i12 = i11;
            sparseArray4 = sparseArray4;
            arrayList3 = arrayList2;
            arrayList5 = arrayList5;
        }
        super.l();
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        SparseArray sparseArray = this.f45872s;
        if (i11 == 0) {
            ((a8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.v.get(i10), (String) this.f45874x.get(i10), false, false);
            return;
        }
        if (i11 == 1) {
            ((i3) view).setHeight(0);
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            E((p3) view, i10, false);
            return;
        }
        j8 j8Var = (j8) view;
        Object obj = sparseArray.get(i10);
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!TextUtils.isEmpty(this.N) && this.C.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    j8Var.b(0, stickerSet.title);
                }
                j8Var.d(this.N.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num = (Integer) this.D.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num != null) {
                j8Var.c(stickerSet2.title, 0, null, num.intValue(), !TextUtils.isEmpty(this.N) ? this.N.length() : 0);
            }
            j8Var.d(0, null);
        }
    }

    @Override
    public final void w(o1 o1Var, int i10, List list) {
        if (list.contains(0) && o1Var.f5793f == 3) {
            E((p3) o1Var.f5789a, i10, true);
        } else {
            v(o1Var, i10);
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        View j8Var;
        c6 c6Var = this.P;
        Context context = this.d;
        if (i10 == 0) {
            oy oyVar = new oy(3, context, c6Var, false);
            oyVar.getImageView().setLayerNum(3);
            j8Var = oyVar;
        } else if (i10 == 1) {
            j8Var = new i3(context);
        } else if (i10 == 2) {
            j8Var = new j8(this.d, false, true, this.P, false);
        } else if (i10 == 3) {
            p3 p3Var = new p3(17, this.d, this.P, true, true);
            p3Var.setAddOnClickListener(new c5(this, 18));
            j8Var = p3Var;
        } else if (i10 == 4) {
            j8Var = new View(context);
        } else if (i10 != 5) {
            j8Var = null;
        } else {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.H.setImageResource(R.drawable.stickers_empty);
            ImageView imageView2 = this.H;
            int i11 = g6.Le;
            imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
            linearLayout.addView(this.H, z5.n(-2, -2));
            linearLayout.addView(new Space(context), z5.n(-1, 15));
            TextView textView = new TextView(context);
            this.I = textView;
            textView.setText(LocaleController.getString(R.string.NoStickersFound));
            this.I.setTextSize(1, 16.0f);
            this.I.setTextColor(g6.v0(i11, c6Var));
            linearLayout.addView(this.I, z5.n(-2, -2));
            linearLayout.setMinimumHeight(AndroidUtilities.dp(112.0f));
            linearLayout.setLayoutParams(z5.c(-1.0f, -1));
            j8Var = linearLayout;
        }
        return new lk0(j8Var);
    }
}
