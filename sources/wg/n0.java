package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.z70;
import org.telegram.ui.eh0;
import org.telegram.ui.i2;
public final class n0 extends LinearLayout {
    public final ArrayList f59218a;
    public final l0 f59219b;
    public final FrameLayout f59220c;
    public final FrameLayout d;
    public final z70 f59221e;

    public n0(Context context) {
        super(context);
        this.f59218a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f59220c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, ja.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        eh0 eh0Var = new eh0(context, 21);
        ImageView imageView = new ImageView(eh0Var.getContext());
        imageView.setImageResource(2131232057);
        q6.s(imageView, j6.E6, null, PorterDuff.Mode.SRC_ATOP);
        eh0Var.addView(imageView);
        frameLayout.addView(eh0Var, ja.e(24, 24, 17));
        l0 l0Var = new l0(context);
        this.f59219b = l0Var;
        l0Var.setLayerType(2, null);
        frameLayout.addView(l0Var, ja.e(70, 70, 17));
        addView(frameLayout, ja.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(2131753321, null));
        textView.setTextSize(1, 20.0f);
        q6.U(textView, j6.G6, null);
        addView(textView, ja.t(-2, -2, 1, 0, 15, 0, 7));
        z70 z70Var = new z70(getContext(), null);
        this.f59221e = z70Var;
        z70Var.setTextSize(1, 14.0f);
        z70Var.setGravity(1);
        q6.U(z70Var, j6.f28957j5, null);
        z70Var.setLineSpacing(z70Var.getLineSpacingExtra(), z70Var.getLineSpacingMultiplier() * 1.1f);
        addView(z70Var, ja.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        char c10;
        l0 l0Var;
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
            arrayList3.add(np.s1(m10.f24934t0).M0(Long.valueOf(-m5.o(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        er erVar = er.f34420f;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (true) {
            arrayList2 = this.f59218a;
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
            l0 l0Var2 = (l0) frameLayout.getChildAt(i15);
            if (l0Var2.getTag() == null) {
                arrayList6.add(l0Var2);
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
            l0 l0Var3 = new l0(getContext());
            l0Var3.setLayerType(2, null);
            l0Var3.d = chat4;
            t8 t8Var = l0Var3.f59208e;
            t8Var.q(chat4);
            l0Var3.f59205a.f(chat4, t8Var);
            int size5 = arrayList6.size();
            frameLayout.addView(l0Var3, i11, ja.e(70, 70, 17));
            l0Var3.setTranslationX(org.telegram.messenger.g0.L(23.0f) * (-size5));
            l0Var3.setAlpha(0.0f);
            l0Var3.setScaleX(0.1f);
            l0Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            l0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(erVar).setDuration(200).start();
            if (size5 == 0) {
                i2 i2Var = l0Var3.f59206b;
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
                    l0Var = (l0) obj6;
                    if (l0Var.d == chat5) {
                        break;
                    }
                } else {
                    l0Var = null;
                    break;
                }
            }
            if (l0Var != null) {
                l0Var.setTag("REMOVED");
                long j3 = 200;
                l0Var.animate().alpha(0.0f).translationXBy(org.telegram.messenger.g0.L(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(erVar).setDuration(j3).setListener(new m0(this, l0Var)).start();
                int size8 = arrayList6.size();
                int i19 = 0;
                int i20 = 0;
                while (i19 < size8) {
                    Object obj7 = arrayList6.get(i19);
                    i19++;
                    l0 l0Var4 = (l0) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (l0Var4 != l0Var) {
                        i20++;
                        i10 = size6;
                        l0Var4.animate().translationX((-(size9 - i20)) * org.telegram.messenger.g0.L(23.0f)).setInterpolator(erVar).setDuration(j3).start();
                    } else {
                        i10 = size6;
                    }
                    size6 = i10;
                }
                i7 = size6;
                if (i5.c.h(1, arrayList6) == l0Var && arrayList6.size() > 1) {
                    c11 = 2;
                    ((l0) i5.c.h(2, arrayList6)).f59206b.setScaleY(0.1f);
                    ((l0) arrayList6.get(arrayList6.size() - 2)).f59206b.setScaleX(0.1f);
                    ((l0) arrayList6.get(arrayList6.size() - 2)).f59206b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j3).setInterpolator(erVar).start();
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
        l0 l0Var5 = this.f59219b;
        if (l0Var5.d == null) {
            l0Var5.d = chat;
            t8 t8Var2 = l0Var5.f59208e;
            t8Var2.q(chat);
            l0Var5.f59205a.f(chat, t8Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f59220c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(erVar).translationX(org.telegram.messenger.g0.L(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(erVar).translationX(0.0f).setDuration(200).start();
        }
        l0Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j10 = 200;
            frameLayout.animate().setInterpolator(erVar).translationX(0.0f).setDuration(j10).start();
            l0Var5.animate().setInterpolator(erVar).translationX(0.0f).setDuration(j10).start();
            return;
        }
        long j11 = 200;
        frameLayout.animate().setInterpolator(erVar).translationX(-org.telegram.messenger.g0.L(48.0f)).setDuration(j11).start();
        l0Var5.animate().setInterpolator(erVar).translationX(org.telegram.messenger.g0.L(48.0f)).setDuration(j11).start();
    }
}
