package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i2.o1;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.zr;
import w7.z5;
public final class p0 extends LinearLayout {
    public final ArrayList f48188a;
    public final m0 f48189b;
    public final FrameLayout f48190c;
    public final FrameLayout d;
    public final w90 e;

    public p0(Context context) {
        super(context);
        this.f48188a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f48190c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, z5.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        ImageView imageView = new ImageView(frameLayout3.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        r6.t(imageView, k6.E6, null, PorterDuff.Mode.SRC_ATOP);
        frameLayout3.addView(imageView);
        frameLayout.addView(frameLayout3, z5.e(24, 24, 17));
        m0 m0Var = new m0(context);
        this.f48189b = m0Var;
        m0Var.setLayerType(2, null);
        frameLayout.addView(m0Var, z5.e(70, 70, 17));
        addView(frameLayout, z5.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        tl.n(R.string.BoostingReassignBoost, textView, 1, 20.0f);
        r6.W(textView, k6.G6, null);
        addView(textView, z5.t(-2, -2, 1, 0, 15, 0, 7));
        w90 w90Var = new w90(getContext(), null);
        this.e = w90Var;
        w90Var.setTextSize(1, 14.0f);
        w90Var.setGravity(1);
        r6.W(w90Var, k6.f21290j5, null);
        w90Var.setLineSpacing(w90Var.getLineSpacingExtra(), w90Var.getLineSpacingMultiplier() * 1.1f);
        addView(w90Var, z5.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        char c10;
        m0 m0Var;
        int i10;
        char c11;
        int i11;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            arrayList3.add(MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        zr zrVar = zr.f33337f;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.f48188a;
            if (i14 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i14);
            i14++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
            if (!arrayList2.contains(chat2)) {
                arrayList5.add(chat2);
            }
        }
        int size3 = arrayList2.size();
        int i15 = 0;
        while (i15 < size3) {
            Object obj3 = arrayList2.get(i15);
            i15++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
            if (!arrayList3.contains(chat3)) {
                arrayList4.add(chat3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int i16 = 0;
        while (true) {
            frameLayout = this.d;
            if (i16 >= frameLayout.getChildCount()) {
                break;
            }
            m0 m0Var2 = (m0) frameLayout.getChildAt(i16);
            if (m0Var2.getTag() == null) {
                arrayList6.add(m0Var2);
            }
            i16++;
        }
        int size4 = arrayList5.size();
        int i17 = 0;
        while (true) {
            c10 = 2;
            if (i17 >= size4) {
                break;
            }
            Object obj4 = arrayList5.get(i17);
            i17++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            m0 m0Var3 = new m0(getContext());
            m0Var3.setLayerType(2, null);
            m0Var3.d = chat4;
            f9 f9Var = m0Var3.e;
            f9Var.q(chat4);
            m0Var3.f48174a.e(chat4, f9Var);
            int size5 = arrayList6.size();
            frameLayout.addView(m0Var3, i12, z5.e(70, 70, 17));
            m0Var3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
            m0Var3.setAlpha(0.0f);
            m0Var3.setScaleX(0.1f);
            m0Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            m0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(zrVar).setDuration(200).start();
            if (size5 == 0) {
                n0 n0Var = m0Var3.f48175b;
                n0Var.setScaleY(1.0f);
                n0Var.setScaleX(1.0f);
                n0Var.setAlpha(1.0f);
            }
            arrayList5 = arrayList7;
            i12 = 0;
        }
        ArrayList arrayList8 = arrayList5;
        int size6 = arrayList4.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj5 = arrayList4.get(i18);
            i18++;
            TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
            int size7 = arrayList6.size();
            int i19 = 0;
            while (true) {
                if (i19 < size7) {
                    Object obj6 = arrayList6.get(i19);
                    i19++;
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
                long j10 = 200;
                m0Var.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(zrVar).setDuration(j10).setListener(new o0(this, m0Var)).start();
                int size8 = arrayList6.size();
                int i20 = 0;
                int i21 = 0;
                while (i20 < size8) {
                    Object obj7 = arrayList6.get(i20);
                    i20++;
                    m0 m0Var4 = (m0) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (m0Var4 != m0Var) {
                        i21++;
                        i11 = size6;
                        m0Var4.animate().translationX((-(size9 - i21)) * AndroidUtilities.dp(23.0f)).setInterpolator(zrVar).setDuration(j10).start();
                    } else {
                        i11 = size6;
                    }
                    size6 = i11;
                }
                i10 = size6;
                if (o1.i(1, arrayList6) == m0Var && arrayList6.size() > 1) {
                    c11 = 2;
                    ((m0) o1.i(2, arrayList6)).f48175b.setScaleY(0.1f);
                    ((m0) arrayList6.get(arrayList6.size() - 2)).f48175b.setScaleX(0.1f);
                    ((m0) arrayList6.get(arrayList6.size() - 2)).f48175b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j10).setInterpolator(zrVar).start();
                    c10 = c11;
                    size6 = i10;
                } else {
                    c11 = 2;
                }
            } else {
                i10 = size6;
                c11 = c10;
            }
            c10 = c11;
            size6 = i10;
        }
        m0 m0Var5 = this.f48189b;
        if (m0Var5.d == null) {
            m0Var5.d = chat;
            f9 f9Var2 = m0Var5.e;
            f9Var2.q(chat);
            m0Var5.f48174a.e(chat, f9Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f48190c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(zrVar).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(zrVar).translationX(0.0f).setDuration(200).start();
        }
        m0Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j11 = 200;
            frameLayout.animate().setInterpolator(zrVar).translationX(0.0f).setDuration(j11).start();
            m0Var5.animate().setInterpolator(zrVar).translationX(0.0f).setDuration(j11).start();
            return;
        }
        long j12 = 200;
        frameLayout.animate().setInterpolator(zrVar).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j12).start();
        m0Var5.animate().setInterpolator(zrVar).translationX(AndroidUtilities.dp(48.0f)).setDuration(j12).start();
    }
}
