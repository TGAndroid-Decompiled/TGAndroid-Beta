package ug;

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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.pr;
import w7.x5;
public final class s0 extends LinearLayout {
    public final ArrayList f47204a;
    public final p0 f47205b;
    public final FrameLayout f47206c;
    public final FrameLayout d;
    public final d90 f47207e;

    public s0(Context context) {
        super(context);
        this.f47204a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f47206c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, x5.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        ImageView imageView = new ImageView(frameLayout3.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(j6.w0(null, j6.E6, false));
        frameLayout3.addView(imageView);
        frameLayout.addView(frameLayout3, x5.e(24, 24, 17));
        p0 p0Var = new p0(context);
        this.f47205b = p0Var;
        p0Var.setLayerType(2, null);
        frameLayout.addView(p0Var, x5.e(70, 70, 17));
        addView(frameLayout, x5.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.BoostingReassignBoost));
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(j6.w0(null, j6.G6, false));
        addView(textView, x5.t(-2, -2, 1, 0, 15, 0, 7));
        d90 d90Var = new d90(getContext(), null);
        this.f47207e = d90Var;
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(1);
        d90Var.setTextColor(j6.w0(null, j6.f20770j5, false));
        d90Var.setLineSpacing(d90Var.getLineSpacingExtra(), d90Var.getLineSpacingMultiplier() * 1.1f);
        addView(d90Var, x5.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        p0 p0Var;
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
        pr prVar = pr.f29466f;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.f47204a;
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
            p0 p0Var2 = (p0) frameLayout.getChildAt(i16);
            if (p0Var2.getTag() == null) {
                arrayList6.add(p0Var2);
            }
            i16++;
        }
        int size4 = arrayList5.size();
        int i17 = 0;
        while (i17 < size4) {
            Object obj4 = arrayList5.get(i17);
            i17++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            p0 p0Var3 = new p0(getContext());
            p0Var3.setLayerType(2, null);
            p0Var3.d = chat4;
            i9 i9Var = p0Var3.f47192e;
            i9Var.q(chat4);
            p0Var3.f47189a.e(chat4, i9Var);
            int size5 = arrayList6.size();
            frameLayout.addView(p0Var3, i12, x5.e(70, 70, 17));
            p0Var3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
            p0Var3.setAlpha(0.0f);
            p0Var3.setScaleX(0.1f);
            p0Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            p0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(prVar).setDuration(200).start();
            if (size5 == 0) {
                q0 q0Var = p0Var3.f47190b;
                q0Var.setScaleY(1.0f);
                q0Var.setScaleX(1.0f);
                q0Var.setAlpha(1.0f);
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
                    p0Var = (p0) obj6;
                    if (p0Var.d == chat5) {
                        break;
                    }
                } else {
                    p0Var = null;
                    break;
                }
            }
            if (p0Var != null) {
                p0Var.setTag("REMOVED");
                long j3 = 200;
                p0Var.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(prVar).setDuration(j3).setListener(new r0(this, p0Var)).start();
                int size8 = arrayList6.size();
                int i20 = 0;
                int i21 = 0;
                while (i20 < size8) {
                    Object obj7 = arrayList6.get(i20);
                    i20++;
                    p0 p0Var4 = (p0) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (p0Var4 != p0Var) {
                        i21++;
                        i11 = size6;
                        p0Var4.animate().translationX((-(size9 - i21)) * AndroidUtilities.dp(23.0f)).setInterpolator(prVar).setDuration(j3).start();
                    } else {
                        i11 = size6;
                    }
                    size6 = i11;
                }
                i10 = size6;
                if (i2.g.h(1, arrayList6) == p0Var && arrayList6.size() > 1) {
                    ((p0) i2.g.h(2, arrayList6)).f47190b.setScaleY(0.1f);
                    ((p0) arrayList6.get(arrayList6.size() - 2)).f47190b.setScaleX(0.1f);
                    ((p0) arrayList6.get(arrayList6.size() - 2)).f47190b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j3).setInterpolator(prVar).start();
                    size6 = i10;
                }
            } else {
                i10 = size6;
            }
            size6 = i10;
        }
        p0 p0Var5 = this.f47205b;
        if (p0Var5.d == null) {
            p0Var5.d = chat;
            i9 i9Var2 = p0Var5.f47192e;
            i9Var2.q(chat);
            p0Var5.f47189a.e(chat, i9Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f47206c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(prVar).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(prVar).translationX(0.0f).setDuration(200).start();
        }
        p0Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j10 = 200;
            frameLayout.animate().setInterpolator(prVar).translationX(0.0f).setDuration(j10).start();
            p0Var5.animate().setInterpolator(prVar).translationX(0.0f).setDuration(j10).start();
            return;
        }
        long j11 = 200;
        frameLayout.animate().setInterpolator(prVar).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j11).start();
        p0Var5.animate().setInterpolator(prVar).translationX(AndroidUtilities.dp(48.0f)).setDuration(j11).start();
    }
}
