package rg;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import bi.y7;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import di.i8;
import fi.r4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import w7.s6;
import zh.g3;
import zh.n5;
import zh.t3;
public final class b0 implements org.telegram.ui.ActionBar.z1, i8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, ne.d, t0.f, qa.a, bm0, vh.a, x2.k, Continuation, zf.n, r0.o, BillingController.ProductDetailsResponseListenerLegacy, e2.j, f5, Utilities.Callback5 {
    public final int f44208a;
    public final Object f44209b;

    public b0(Object obj, int i10) {
        this.f44208a = i10;
        this.f44209b = obj;
    }

    @Override
    public void C(float f7, int i10) {
        int i11 = this.f44208a;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        zh.d0 d0Var = (zh.d0) this.f44209b;
        if (z10) {
            long j10 = i10;
            if (d0Var.I != j10) {
                d0Var.I = j10;
                d0Var.f50366r.setText(zh.d0.q(j10));
            }
            d0Var.o(true);
        }
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ((yh.k0) this.f44209b).h.j(l1Var);
        return r0.l1.f43740b;
    }

    @Override
    public e9.x1 a(int i10, b2.q1 q1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f44209b;
        e9.k0 t10 = e9.n0.t();
        for (int i11 = 0; i11 < q1Var.f2291a; i11++) {
            t10.c(new x2.f(i10, q1Var, i11, iVar, iArr[i11]));
        }
        return t10.f();
    }

    @Override
    public void accept(Object obj) {
        switch (this.f44208a) {
            case 22:
                z3.i iVar = (z3.i) this.f44209b;
                z3.b bVar = (z3.b) obj;
                z3.h hVar = new z3.h(bVar.f49253b, sb.a.s2(bVar.f49252a, bVar.f49254c));
                iVar.f49263c.add(hVar);
                long j10 = iVar.f49267j;
                if (j10 == -9223372036854775807L || bVar.d >= j10) {
                    iVar.g(hVar);
                    return;
                }
                return;
            default:
                ((e9.k0) this.f44209b).c((z3.b) obj);
                return;
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        ug.z0.R((ug.z0) this.f44209b, view);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        q2 q2Var = (q2) this.f44209b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            q2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        l5.a(this, i10, str, drawable);
    }

    @Override
    public void e(long j10) {
        switch (this.f44208a) {
            case 18:
                ((yh.e) this.f44209b).a(j10, true);
                return;
            default:
                ((g3) this.f44209b).h();
                return;
        }
    }

    @Override
    public void f(qa.b bVar) {
        u9.a aVar = (u9.a) this.f44209b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f46234b.set((u9.a) bVar.get());
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f44208a) {
            case 0:
                ((c0) this.f44209b).f44212a.f44410f2.s();
                return;
            case 10:
                ((ug.t0) this.f44209b).run();
                return;
            case 11:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f44209b;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    ug.c0.U(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 12:
                ((org.telegram.messenger.w2) this.f44209b).run();
                return;
            case 13:
                ((ug.t0) this.f44209b).run();
                return;
            case 19:
                ((y7) this.f44209b).run();
                return;
            default:
                ((Utilities.Callback) this.f44209b).run(a2Var.g(i10, true, true));
                return;
        }
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f44209b, options);
    }

    @Override
    public boolean j(t0.j jVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f44209b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                jVar.f45502a.d();
                Parcelable parcelable = (Parcelable) jVar.f45502a.j();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.i iVar = jVar.f45502a;
        ClipData clipData = new ClipData(iVar.getDescription(), new ClipData.Item(iVar.c()));
        if (i11 >= 31) {
            dVar = new j2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f43711b = clipData;
            eVar.f43712c = 2;
            dVar = eVar;
        }
        dVar.b(iVar.f());
        dVar.setExtras(bundle);
        if (r0.j0.h(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        l5.b(this, imageReceiver);
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        int i10;
        yh.p1 p1Var = (yh.p1) this.f44209b;
        ArrayList arrayList = p1Var.f49069n0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.p pVar = (c5.p) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    sg.k kVar = (sg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(pVar.f4404c)) {
                        kVar.h = pVar;
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((sg.k) obj2).f45234g = j10;
        }
        AndroidUtilities.runOnUIThread(new rh.j(p1Var, 25));
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f44208a;
        Object obj2 = this.f44209b;
        switch (i10) {
            case 2:
                z1 z1Var = (z1) obj2;
                bc.b bVar = (bc.b) obj;
                z1Var.C0 = true;
                z1Var.B0 = false;
                return;
            case 3:
                r4 r4Var = (r4) obj2;
                bc.b bVar2 = (bc.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f2632a.size(); i11++) {
                    bc.a aVar = (bc.a) bVar2.f2632a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f44438a = aVar.f2629a;
                    obj3.f44439b = aVar.d;
                    obj3.f44440c = aVar.e;
                    obj3.d = aVar.f2630b;
                    obj3.e = aVar.f2631c;
                    arrayList.add(obj3);
                }
                r4Var.run(arrayList);
                return;
            default:
                p2 p2Var = (p2) obj2;
                List list = (List) obj;
                p2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((yb.a) list.get(0)).f48735c;
                String str = null;
                if (s6.f47432a == null) {
                    s6.f47432a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = s6.f47432a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                p2Var.f44458c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((yb.a) list.get(0)).f48735c);
                sb2.append(" ");
                sb2.append(p2Var.f44458c0);
                sb2.append(" ");
                i2.d.t(((yb.a) list.get(0)).f48733a, sb2);
                Emoji.getEmojiDrawable(p2Var.f44458c0);
                return;
        }
    }

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
        switch (this.f44208a) {
            case 6:
                rh.c.a((rh.c) this.f44209b);
                return;
            default:
                View view = ((t3) this.f44209b).f51174b;
                if (view instanceof org.telegram.ui.Cells.x0) {
                    ((org.telegram.ui.Cells.x0) view).N();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
        }
    }

    @Override
    public void q(Canvas canvas, int i10) {
        vh.h hVar = (vh.h) this.f44209b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f47050r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n5.b((n5) this.f44209b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f44209b).countDown();
        return null;
    }

    private final void b(float f7, int i10) {
    }

    private final void c(float f7, int i10) {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
