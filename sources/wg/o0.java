package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kr;
import org.telegram.ui.gh0;
import org.telegram.ui.i2;
public final class o0 extends LinearLayout {
    public final ArrayList f59913a;
    public final m0 f59914b;
    public final FrameLayout f59915c;
    public final FrameLayout d;
    public final j80 f59916e;

    public o0(Context context) {
        super(context);
        this.f59913a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f59915c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, na.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        gh0 gh0Var = new gh0(context, 21);
        ImageView imageView = new ImageView(gh0Var.getContext());
        imageView.setImageResource(2131232061);
        u6.s(imageView, n6.E6, null, PorterDuff.Mode.SRC_ATOP);
        gh0Var.addView(imageView);
        frameLayout.addView(gh0Var, na.e(24, 24, 17));
        m0 m0Var = new m0(context);
        this.f59914b = m0Var;
        m0Var.setLayerType(2, null);
        frameLayout.addView(m0Var, na.e(70, 70, 17));
        addView(frameLayout, na.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.N0(2131753318, null));
        textView.setTextSize(1, 20.0f);
        u6.U(textView, n6.G6, null);
        addView(textView, na.t(-2, -2, 1, 0, 15, 0, 7));
        j80 j80Var = new j80(getContext(), null);
        this.f59916e = j80Var;
        j80Var.setTextSize(1, 14.0f);
        j80Var.setGravity(1);
        u6.U(j80Var, n6.f29559j5, null);
        j80Var.setLineSpacing(j80Var.getLineSpacingExtra(), j80Var.getLineSpacingMultiplier() * 1.1f);
        addView(j80Var, na.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        char c10;
        m0 m0Var;
        int i7;
        char c11;
        int i10;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            arrayList3.add(mp.u1(i10.f24637t0).O0(Long.valueOf(-n5.o(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        kr krVar = kr.f36858f;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (true) {
            arrayList2 = this.f59913a;
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
            m0 m0Var2 = (m0) frameLayout.getChildAt(i15);
            if (m0Var2.getTag() == null) {
                arrayList6.add(m0Var2);
            }
            i15++;
        }
        int size4 = arrayList5.size();
        int i16 = 0;
        while (true) {
            c10 = 2;
            if (i16 >= size4) {
                break;
            }
            Object obj4 = arrayList5.get(i16);
            i16++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            m0 m0Var3 = new m0(getContext());
            m0Var3.setLayerType(2, null);
            m0Var3.d = chat4;
            a9 a9Var = m0Var3.f59905e;
            a9Var.q(chat4);
            m0Var3.f59902a.f(chat4, a9Var);
            int size5 = arrayList6.size();
            frameLayout.addView(m0Var3, i11, na.e(70, 70, 17));
            m0Var3.setTranslationX(org.telegram.messenger.g0.L(23.0f) * (-size5));
            m0Var3.setAlpha(0.0f);
            m0Var3.setScaleX(0.1f);
            m0Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            m0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(krVar).setDuration(200).start();
            if (size5 == 0) {
                i2 i2Var = m0Var3.f59903b;
                i2Var.setScaleY(1.0f);
                i2Var.setScaleX(1.0f);
                i2Var.setAlpha(1.0f);
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
                    m0Var = (m0) obj6;
                    if (m0Var.d == chat5) {
                        break;
                    }
                } else {
                    m0Var = null;
                    break;
                }
            }
            if (m0Var != null) {
                m0Var.setTag("REMOVED");
                long j3 = 200;
                m0Var.animate().alpha(0.0f).translationXBy(org.telegram.messenger.g0.L(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(krVar).setDuration(j3).setListener(new n0(this, m0Var)).start();
                int size8 = arrayList6.size();
                int i19 = 0;
                int i20 = 0;
                while (i19 < size8) {
                    Object obj7 = arrayList6.get(i19);
                    i19++;
                    m0 m0Var4 = (m0) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (m0Var4 != m0Var) {
                        i20++;
                        i10 = size6;
                        m0Var4.animate().translationX((-(size9 - i20)) * org.telegram.messenger.g0.L(23.0f)).setInterpolator(krVar).setDuration(j3).start();
                    } else {
                        i10 = size6;
                    }
                    size6 = i10;
                }
                i7 = size6;
                if (i5.c.h(1, arrayList6) == m0Var && arrayList6.size() > 1) {
                    c11 = 2;
                    ((m0) i5.c.h(2, arrayList6)).f59903b.setScaleY(0.1f);
                    ((m0) arrayList6.get(arrayList6.size() - 2)).f59903b.setScaleX(0.1f);
                    ((m0) arrayList6.get(arrayList6.size() - 2)).f59903b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j3).setInterpolator(krVar).start();
                    c10 = c11;
                    size6 = i7;
                } else {
                    c11 = 2;
                }
            } else {
                i7 = size6;
                c11 = c10;
            }
            c10 = c11;
            size6 = i7;
        }
        m0 m0Var5 = this.f59914b;
        if (m0Var5.d == null) {
            m0Var5.d = chat;
            a9 a9Var2 = m0Var5.f59905e;
            a9Var2.q(chat);
            m0Var5.f59902a.f(chat, a9Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f59915c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(krVar).translationX(org.telegram.messenger.g0.L(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(krVar).translationX(0.0f).setDuration(200).start();
        }
        m0Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j10 = 200;
            frameLayout.animate().setInterpolator(krVar).translationX(0.0f).setDuration(j10).start();
            m0Var5.animate().setInterpolator(krVar).translationX(0.0f).setDuration(j10).start();
            return;
        }
        long j11 = 200;
        frameLayout.animate().setInterpolator(krVar).translationX(-org.telegram.messenger.g0.L(48.0f)).setDuration(j11).start();
        m0Var5.animate().setInterpolator(krVar).translationX(org.telegram.messenger.g0.L(48.0f)).setDuration(j11).start();
    }
}
