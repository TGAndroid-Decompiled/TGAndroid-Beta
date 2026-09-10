package sg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.wr;
import w7.a6;
public final class t0 extends LinearLayout {
    public final ArrayList f42006a;
    public final q0 f42007b;
    public final FrameLayout f42008c;
    public final FrameLayout d;
    public final m90 e;

    public t0(Context context) {
        super(context);
        this.f42006a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f42008c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, a6.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        ImageView imageView = new ImageView(frameLayout3.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(j6.w0(null, j6.E6, false));
        frameLayout3.addView(imageView);
        frameLayout.addView(frameLayout3, a6.e(24, 24, 17));
        q0 q0Var = new q0(context);
        this.f42007b = q0Var;
        q0Var.setLayerType(2, null);
        frameLayout.addView(q0Var, a6.e(70, 70, 17));
        addView(frameLayout, a6.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.BoostingReassignBoost));
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(j6.w0(null, j6.G6, false));
        addView(textView, a6.t(-2, -2, 1, 0, 15, 0, 7));
        m90 m90Var = new m90(getContext(), null);
        this.e = m90Var;
        m90Var.setTextSize(1, 14.0f);
        m90Var.setGravity(1);
        m90Var.setTextColor(j6.w0(null, j6.f18034j5, false));
        m90Var.setLineSpacing(m90Var.getLineSpacingExtra(), m90Var.getLineSpacingMultiplier() * 1.1f);
        addView(m90Var, a6.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        q0 q0Var;
        int i10;
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
        wr wrVar = wr.f28819f;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.f42006a;
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
            q0 q0Var2 = (q0) frameLayout.getChildAt(i16);
            if (q0Var2.getTag() == null) {
                arrayList6.add(q0Var2);
            }
            i16++;
        }
        int size4 = arrayList5.size();
        int i17 = 0;
        while (i17 < size4) {
            Object obj4 = arrayList5.get(i17);
            i17++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            q0 q0Var3 = new q0(getContext());
            q0Var3.setLayerType(2, null);
            q0Var3.d = chat4;
            g9 g9Var = q0Var3.e;
            g9Var.q(chat4);
            q0Var3.f41994a.e(chat4, g9Var);
            int size5 = arrayList6.size();
            frameLayout.addView(q0Var3, i12, a6.e(70, 70, 17));
            q0Var3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
            q0Var3.setAlpha(0.0f);
            q0Var3.setScaleX(0.1f);
            q0Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            q0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(wrVar).setDuration(200).start();
            if (size5 == 0) {
                r0 r0Var = q0Var3.f41995b;
                r0Var.setScaleY(1.0f);
                r0Var.setScaleX(1.0f);
                r0Var.setAlpha(1.0f);
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
                    q0Var = (q0) obj6;
                    if (q0Var.d == chat5) {
                        break;
                    }
                } else {
                    q0Var = null;
                    break;
                }
            }
            if (q0Var != null) {
                q0Var.setTag("REMOVED");
                long j3 = 200;
                q0Var.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(wrVar).setDuration(j3).setListener(new s0(this, q0Var)).start();
                int size8 = arrayList6.size();
                int i20 = 0;
                int i21 = 0;
                while (i20 < size8) {
                    Object obj7 = arrayList6.get(i20);
                    i20++;
                    q0 q0Var4 = (q0) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (q0Var4 != q0Var) {
                        i21++;
                        i11 = size6;
                        q0Var4.animate().translationX((-(size9 - i21)) * AndroidUtilities.dp(23.0f)).setInterpolator(wrVar).setDuration(j3).start();
                    } else {
                        i11 = size6;
                    }
                    size6 = i11;
                }
                i10 = size6;
                if (hc.b.i(1, arrayList6) == q0Var && arrayList6.size() > 1) {
                    ((q0) hc.b.i(2, arrayList6)).f41995b.setScaleY(0.1f);
                    ((q0) arrayList6.get(arrayList6.size() - 2)).f41995b.setScaleX(0.1f);
                    ((q0) arrayList6.get(arrayList6.size() - 2)).f41995b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j3).setInterpolator(wrVar).start();
                    size6 = i10;
                }
            } else {
                i10 = size6;
            }
            size6 = i10;
        }
        q0 q0Var5 = this.f42007b;
        if (q0Var5.d == null) {
            q0Var5.d = chat;
            g9 g9Var2 = q0Var5.e;
            g9Var2.q(chat);
            q0Var5.f41994a.e(chat, g9Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f42008c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(wrVar).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(wrVar).translationX(0.0f).setDuration(200).start();
        }
        q0Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j10 = 200;
            frameLayout.animate().setInterpolator(wrVar).translationX(0.0f).setDuration(j10).start();
            q0Var5.animate().setInterpolator(wrVar).translationX(0.0f).setDuration(j10).start();
            return;
        }
        long j11 = 200;
        frameLayout.animate().setInterpolator(wrVar).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j11).start();
        q0Var5.animate().setInterpolator(wrVar).translationX(AndroidUtilities.dp(48.0f)).setDuration(j11).start();
    }
}
