package zh;

import ai.q1;
import ai.wa;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ei.k1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.r5;
import w7.z5;
public abstract class r extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final long[] K = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter L = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public boolean E;
    public boolean F;
    public final HashSet G;
    public final HashSet H;
    public ArrayList I;
    public boolean J;
    public final int f52087a;
    public final j0 f52088b;
    public final m f52089c;
    public final s4.s d;
    public final k e;
    public final ml0 f52090f;
    public final q h;
    public final ArrayList f52091n;
    public int f52092r;
    public int f52093s;
    public boolean v;
    public final boolean f52094w;
    public int f52095x;
    public TLRPC.TL_messages_stickerSet f52096y;

    public r(Context context, int i10, j0 j0Var) {
        super(context);
        k0 k0Var = (k0) this;
        k kVar = new k(k0Var);
        this.e = kVar;
        this.f52091n = new ArrayList();
        this.f52092r = 7;
        this.f52095x = -1711276033;
        this.G = new HashSet();
        this.H = new HashSet();
        this.f52087a = i10;
        this.f52088b = j0Var;
        this.f52094w = UserConfig.getInstance(i10).isPremium();
        ?? jm0Var = new jm0(context, null);
        this.f52089c = jm0Var;
        s4.s sVar = new s4.s(this.f52092r);
        this.d = sVar;
        sVar.O = new q1(k0Var, 9);
        jm0Var.setLayoutManager(sVar);
        ml0 ml0Var = new ml0(jm0Var, sVar);
        this.f52090f = ml0Var;
        ml0Var.f28552i = new k1(k0Var, 2);
        jm0Var.setAdapter(kVar);
        jm0Var.setSelectorDrawableColor(0);
        jm0Var.setOnItemClickListener(new wa(j0Var, 25));
        jm0Var.setItemAnimator(null);
        jm0Var.setOverScrollMode(2);
        jm0Var.setVerticalScrollBarEnabled(false);
        jm0Var.setClipToPadding(false);
        jm0Var.j(new kv(k0Var, 26));
        addView((View) jm0Var, z5.c(-1.0f, -1));
        q qVar = new q(k0Var, context);
        this.h = qVar;
        addView(qVar, z5.e(-1, 36, 48));
        e();
    }

    public static void b(Canvas canvas, Drawable drawable) {
        boolean d = d(drawable);
        if (d) {
            drawable.setColorFilter(L);
        }
        drawable.draw(canvas);
        if (d) {
            drawable.setColorFilter(null);
        }
    }

    public static boolean d(Drawable drawable) {
        if ((drawable instanceof r5) && MessageObject.isTextColorEmoji(((r5) drawable).e)) {
            return true;
        }
        return false;
    }

    public final ArrayList a() {
        String[] split;
        if (this.I == null) {
            this.I = new ArrayList();
            for (String str : MessagesController.getMainSettings(this.f52087a).getString("qrAppliedEmoji", "").split(",")) {
                try {
                    if (!str.isEmpty()) {
                        this.I.add(Long.valueOf(Long.parseLong(str)));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return this.I;
    }

    public final int c() {
        int R;
        m mVar = this.f52089c;
        int paddingTop = mVar.getPaddingTop();
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < mVar.getChildCount(); i12++) {
            View childAt = mVar.getChildAt(i12);
            this.d.getClass();
            int z10 = s4.n0.z(childAt);
            if (z10 >= paddingTop && z10 < i10 && (R = RecyclerView.R(childAt)) != -1) {
                i11 = R;
                i10 = z10;
            }
        }
        if (i11 == -1) {
            return 0;
        }
        return i11;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad && objArr.length > 0) {
            Object obj = objArr[0];
            if ((obj instanceof Integer) && ((Integer) obj).intValue() != 5) {
                return;
            }
        }
        e();
    }

    public final void e() {
        String str;
        String str2;
        long j10;
        long j11;
        long j12;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        String str3;
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        int i10;
        int i11;
        boolean z10;
        ArrayList arrayList4;
        int i12;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList5;
        int i13 = this.f52087a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i13);
        ArrayList<o> arrayList6 = this.f52091n;
        arrayList6.clear();
        ArrayList arrayList7 = new ArrayList();
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
        int size = stickerSets.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i15 >= size) {
                break;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i15);
            i15++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set != null && tL_messages_stickerSet2.documents != null) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Document> arrayList9 = tL_messages_stickerSet2.documents;
                int size2 = arrayList9.size();
                int i16 = 0;
                while (i16 < size2) {
                    TLRPC.Document document2 = arrayList9.get(i16);
                    i16++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null && "application/x-tgsticker".equals(document3.mime_type)) {
                        arrayList8.add(document3);
                    }
                }
                if (!arrayList8.isEmpty()) {
                    arrayList7.add(new o(2, tL_messages_stickerSet2.set.title, arrayList8));
                }
            }
        }
        if (this.f52096y == null && !this.E) {
            this.E = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i13).getStickerSet(tL_inputStickerSetShortName, null, false, true, new g(this, 0));
            if (stickerSet != null && (arrayList5 = stickerSet.documents) != null && !arrayList5.isEmpty()) {
                this.f52096y = stickerSet;
            }
        }
        ArrayList arrayList10 = new ArrayList(21);
        HashSet hashSet = this.H;
        hashSet.clear();
        if (this.f52096y == null && !this.F) {
            for (int i17 = 0; i17 < 21; i17++) {
                arrayList10.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        } else {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.f52096y;
            if (tL_messages_stickerSet3 != null && (arrayList3 = tL_messages_stickerSet3.documents) != null) {
                int size3 = arrayList3.size();
                int i18 = 0;
                while (i18 < size3) {
                    TLRPC.Document document4 = arrayList3.get(i18);
                    i18++;
                    TLRPC.Document document5 = document4;
                    String str4 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.f20286id), document5);
                    }
                    str = str4;
                }
            }
            str2 = str;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.f52096y;
            if (tL_messages_stickerSet4 != null && (arrayList = tL_messages_stickerSet4.packs) != null) {
                int size4 = arrayList.size();
                int i19 = 0;
                while (i19 < size4) {
                    TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i19);
                    i19++;
                    TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                    j10 = 0;
                    if (tL_stickerPack2 != null && (str3 = tL_stickerPack2.emoticon) != null && str3.replace("️", "").equals("❄") && (arrayList2 = tL_stickerPack2.documents) != null && !arrayList2.isEmpty()) {
                        j11 = tL_stickerPack2.documents.get(0).longValue();
                        break;
                    }
                }
            }
            j10 = 0;
            j11 = 0;
            for (int i20 = 0; i20 < 21; i20++) {
                if (i20 == 4 && j11 != j10 && hashMap.containsKey(Long.valueOf(j11))) {
                    j12 = j11;
                } else {
                    j12 = K[i20];
                }
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j12));
                if (document6 == null) {
                    document6 = r5.f(i13, j12);
                }
                if (document6 != null) {
                    arrayList10.add(document6);
                    hashSet.add(Long.valueOf(document6.f20286id));
                } else if (this.G.add(Long.valueOf(j12))) {
                    r5.h(i13).b(j12, new o5() {
                        @Override
                        public final void a(TLRPC.Document document7) {
                            AndroidUtilities.runOnUIThread(new u2.j0(22, r.this, document7));
                        }
                    });
                }
            }
        }
        if (!arrayList10.isEmpty()) {
            arrayList6.add(new o(0, LocaleController.getString(R.string.QrEmojiPresets), arrayList10));
        }
        ArrayList arrayList11 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        int i21 = this.f52092r * 3;
        ArrayList a2 = a();
        int i22 = 0;
        while (i22 < a2.size() && arrayList11.size() < i21) {
            long longValue = ((Long) a2.get(i22)).longValue();
            int size5 = arrayList10.size();
            int i23 = i14;
            while (true) {
                if (i23 < size5) {
                    Object obj = arrayList10.get(i23);
                    i23++;
                    document = (TLRPC.Document) obj;
                    arrayList4 = a2;
                    i12 = i22;
                    if (document.f20286id == longValue) {
                        break;
                    }
                    a2 = arrayList4;
                    i22 = i12;
                } else {
                    arrayList4 = a2;
                    i12 = i22;
                    document = null;
                    break;
                }
            }
            if (document == null) {
                document = r5.f(i13, longValue);
            }
            if (document != null && str2.equals(document.mime_type) && hashSet2.add(Long.valueOf(document.f20286id))) {
                arrayList11.add(document);
            }
            i22 = i12 + 1;
            a2 = arrayList4;
            i14 = 0;
        }
        int i24 = 0;
        while (true) {
            ArrayList<String> arrayList12 = Emoji.recentEmoji;
            if (i24 >= arrayList12.size() || arrayList11.size() >= i21) {
                break;
            }
            String str5 = arrayList12.get(i24);
            if (str5 != null && str5.startsWith("animated_")) {
                try {
                    TLRPC.Document f7 = r5.f(i13, Long.parseLong(str5.substring(9)));
                    if (f7 != null && str2.equals(f7.mime_type)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && hashSet2.add(Long.valueOf(f7.f20286id))) {
                        arrayList11.add(f7);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i24++;
        }
        if (!arrayList11.isEmpty()) {
            i10 = 1;
            arrayList6.add(new o(1, LocaleController.getString(R.string.RecentlyUsed), arrayList11));
        } else {
            i10 = 1;
        }
        arrayList6.addAll(arrayList7);
        int size6 = arrayList6.size();
        int i25 = 0;
        int i26 = 0;
        while (i26 < size6) {
            o oVar = arrayList6.get(i26);
            i26++;
            o oVar2 = oVar;
            oVar2.d = i25;
            if (oVar2.f52069b != null) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            i25 += oVar2.f52070c.size() + i11;
        }
        this.f52093s = i25;
        this.e.l();
        q qVar = this.h;
        qVar.setSections(arrayList6);
        qVar.a(f(c()), false);
    }

    public final int f(int i10) {
        ArrayList arrayList = this.f52091n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o) arrayList.get(size)).d <= i10) {
                return size;
            }
        }
        return 0;
    }

    public m getGrid() {
        return this.f52089c;
    }

    public q getTabs() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f52087a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f52087a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m mVar = this.f52089c;
        int max = Math.max(5, ((i10 - mVar.getPaddingLeft()) - mVar.getPaddingRight()) / AndroidUtilities.dp(46.0f));
        if (max != this.f52092r) {
            this.f52092r = max;
            this.d.y1(max);
            post(new tg.p(this, 22));
        }
    }

    public void setHeaderColor(int i10) {
        if (this.f52095x != i10) {
            this.f52095x = i10;
            int i11 = 0;
            while (true) {
                m mVar = this.f52089c;
                if (i11 < mVar.getChildCount()) {
                    View childAt = mVar.getChildAt(i11);
                    if (childAt instanceof n) {
                        ((n) childAt).f52038a.setTextColor(i10);
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }
}
