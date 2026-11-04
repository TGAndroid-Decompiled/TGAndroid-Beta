package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.j2;
import org.telegram.ui.yg0;
public final class p0 extends LinearLayout {
    public final ArrayList f58746a;
    public final n0 f58747b;
    public final FrameLayout f58748c;
    public final FrameLayout d;
    public final s70 f58749e;

    public p0(Context context) {
        super(context);
        this.f58746a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f58748c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, mf.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        yg0 yg0Var = new yg0(context, 21);
        ImageView imageView = new ImageView(yg0Var.getContext());
        imageView.setImageResource(2131232056);
        r6.t(imageView, k6.E6, null, PorterDuff.Mode.SRC_ATOP);
        yg0Var.addView(imageView);
        frameLayout.addView(yg0Var, mf.e(24, 24, 17));
        n0 n0Var = new n0(context);
        this.f58747b = n0Var;
        n0Var.setLayerType(2, null);
        frameLayout.addView(n0Var, mf.e(70, 70, 17));
        addView(frameLayout, mf.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(2131753321, null));
        textView.setTextSize(1, 20.0f);
        r6.V(textView, k6.G6, null);
        addView(textView, mf.t(-2, -2, 1, 0, 15, 0, 7));
        s70 s70Var = new s70(getContext(), null);
        this.f58749e = s70Var;
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(1);
        r6.V(s70Var, k6.f27988j5, null);
        s70Var.setLineSpacing(s70Var.getLineSpacingExtra(), s70Var.getLineSpacingMultiplier() * 1.1f);
        addView(s70Var, mf.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        char c2;
        n0 n0Var;
        int i3;
        char c10;
        int i10;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            arrayList3.add(hp.s1(h10.f22829t0).M0(Long.valueOf(-m5.o(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        xq xqVar = xq.f40452f;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (true) {
            arrayList2 = this.f58746a;
            if (i13 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i13);
            i13++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
            if (!arrayList2.contains(chat2)) {
                arrayList5.add(chat2);
            }
        }
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList2.get(i14);
            i14++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
            if (!arrayList3.contains(chat3)) {
                arrayList4.add(chat3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int i15 = 0;
        while (true) {
            frameLayout = this.d;
            if (i15 >= frameLayout.getChildCount()) {
                break;
            }
            n0 n0Var2 = (n0) frameLayout.getChildAt(i15);
            if (n0Var2.getTag() == null) {
                arrayList6.add(n0Var2);
            }
            i15++;
        }
        int size4 = arrayList5.size();
        int i16 = 0;
        while (true) {
            c2 = 2;
            if (i16 >= size4) {
                break;
            }
            Object obj4 = arrayList5.get(i16);
            i16++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            n0 n0Var3 = new n0(getContext());
            n0Var3.setLayerType(2, null);
            n0Var3.d = chat4;
            u8 u8Var = n0Var3.f58736e;
            u8Var.q(chat4);
            n0Var3.f58733a.e(chat4, u8Var);
            int size5 = arrayList6.size();
            frameLayout.addView(n0Var3, i11, mf.e(70, 70, 17));
            n0Var3.setTranslationX(org.telegram.messenger.g0.L(23.0f) * (-size5));
            n0Var3.setAlpha(0.0f);
            n0Var3.setScaleX(0.1f);
            n0Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            n0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(xqVar).setDuration(200).start();
            if (size5 == 0) {
                j2 j2Var = n0Var3.f58734b;
                j2Var.setScaleY(1.0f);
                j2Var.setScaleX(1.0f);
                j2Var.setAlpha(1.0f);
            }
            arrayList5 = arrayList7;
            i11 = 0;
        }
        ArrayList arrayList8 = arrayList5;
        int size6 = arrayList4.size();
        int i17 = 0;
        while (i17 < size6) {
            Object obj5 = arrayList4.get(i17);
            i17++;
            TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
            int size7 = arrayList6.size();
            int i18 = 0;
            while (true) {
                if (i18 < size7) {
                    Object obj6 = arrayList6.get(i18);
                    i18++;
                    n0Var = (n0) obj6;
                    if (n0Var.d == chat5) {
                        break;
                    }
                } else {
                    n0Var = null;
                    break;
                }
            }
            if (n0Var != null) {
                n0Var.setTag("REMOVED");
                long j10 = 200;
                n0Var.animate().alpha(0.0f).translationXBy(org.telegram.messenger.g0.L(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(xqVar).setDuration(j10).setListener(new o0(this, n0Var)).start();
                int size8 = arrayList6.size();
                int i19 = 0;
                int i20 = 0;
                while (i19 < size8) {
                    Object obj7 = arrayList6.get(i19);
                    i19++;
                    n0 n0Var4 = (n0) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (n0Var4 != n0Var) {
                        i20++;
                        i10 = size6;
                        n0Var4.animate().translationX((-(size9 - i20)) * org.telegram.messenger.g0.L(23.0f)).setInterpolator(xqVar).setDuration(j10).start();
                    } else {
                        i10 = size6;
                    }
                    size6 = i10;
                }
                i3 = size6;
                if (p1.h(1, arrayList6) == n0Var && arrayList6.size() > 1) {
                    c10 = 2;
                    ((n0) p1.h(2, arrayList6)).f58734b.setScaleY(0.1f);
                    ((n0) arrayList6.get(arrayList6.size() - 2)).f58734b.setScaleX(0.1f);
                    ((n0) arrayList6.get(arrayList6.size() - 2)).f58734b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j10).setInterpolator(xqVar).start();
                    c2 = c10;
                    size6 = i3;
                } else {
                    c10 = 2;
                }
            } else {
                i3 = size6;
                c10 = c2;
            }
            c2 = c10;
            size6 = i3;
        }
        n0 n0Var5 = this.f58747b;
        if (n0Var5.d == null) {
            n0Var5.d = chat;
            u8 u8Var2 = n0Var5.f58736e;
            u8Var2.q(chat);
            n0Var5.f58733a.e(chat, u8Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f58748c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(xqVar).translationX(org.telegram.messenger.g0.L(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(xqVar).translationX(0.0f).setDuration(200).start();
        }
        n0Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j11 = 200;
            frameLayout.animate().setInterpolator(xqVar).translationX(0.0f).setDuration(j11).start();
            n0Var5.animate().setInterpolator(xqVar).translationX(0.0f).setDuration(j11).start();
            return;
        }
        long j12 = 200;
        frameLayout.animate().setInterpolator(xqVar).translationX(-org.telegram.messenger.g0.L(48.0f)).setDuration(j12).start();
        n0Var5.animate().setInterpolator(xqVar).translationX(org.telegram.messenger.g0.L(48.0f)).setDuration(j12).start();
    }
}
