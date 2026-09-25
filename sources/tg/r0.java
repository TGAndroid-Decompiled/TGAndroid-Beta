package tg;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.rr;
import w7.y5;
public final class r0 extends LinearLayout {
    public final ArrayList f43482a;
    public final o0 f43483b;
    public final FrameLayout f43484c;
    public final FrameLayout d;
    public final n90 e;

    public r0(Context context) {
        super(context);
        this.f43482a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f43484c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, y5.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        ImageView imageView = new ImageView(frameLayout3.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(h6.w0(null, h6.E6, false));
        frameLayout3.addView(imageView);
        frameLayout.addView(frameLayout3, y5.e(24, 24, 17));
        o0 o0Var = new o0(context);
        this.f43483b = o0Var;
        o0Var.setLayerType(2, null);
        frameLayout.addView(o0Var, y5.e(70, 70, 17));
        addView(frameLayout, y5.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.BoostingReassignBoost));
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(h6.w0(null, h6.G6, false));
        addView(textView, y5.t(-2, -2, 1, 0, 15, 0, 7));
        n90 n90Var = new n90(getContext(), null);
        this.e = n90Var;
        n90Var.setTextSize(1, 14.0f);
        n90Var.setGravity(1);
        n90Var.setTextColor(h6.w0(null, h6.f19166j5, false));
        n90Var.setLineSpacing(n90Var.getLineSpacingExtra(), n90Var.getLineSpacingMultiplier() * 1.1f);
        addView(n90Var, y5.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        o0 o0Var;
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
        rr rrVar = rr.f28031f;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.f43482a;
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
            o0 o0Var2 = (o0) frameLayout.getChildAt(i16);
            if (o0Var2.getTag() == null) {
                arrayList6.add(o0Var2);
            }
            i16++;
        }
        int size4 = arrayList5.size();
        int i17 = 0;
        while (i17 < size4) {
            Object obj4 = arrayList5.get(i17);
            i17++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            o0 o0Var3 = new o0(getContext());
            o0Var3.setLayerType(2, null);
            o0Var3.d = chat4;
            h9 h9Var = o0Var3.e;
            h9Var.q(chat4);
            o0Var3.f43468a.e(chat4, h9Var);
            int size5 = arrayList6.size();
            frameLayout.addView(o0Var3, i12, y5.e(70, 70, 17));
            o0Var3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
            o0Var3.setAlpha(0.0f);
            o0Var3.setScaleX(0.1f);
            o0Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            o0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(rrVar).setDuration(200).start();
            if (size5 == 0) {
                p0 p0Var = o0Var3.f43469b;
                p0Var.setScaleY(1.0f);
                p0Var.setScaleX(1.0f);
                p0Var.setAlpha(1.0f);
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
                    o0Var = (o0) obj6;
                    if (o0Var.d == chat5) {
                        break;
                    }
                } else {
                    o0Var = null;
                    break;
                }
            }
            if (o0Var != null) {
                o0Var.setTag("REMOVED");
                long j3 = 200;
                o0Var.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(rrVar).setDuration(j3).setListener(new q0(this, o0Var)).start();
                int size8 = arrayList6.size();
                int i20 = 0;
                int i21 = 0;
                while (i20 < size8) {
                    Object obj7 = arrayList6.get(i20);
                    i20++;
                    o0 o0Var4 = (o0) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (o0Var4 != o0Var) {
                        i21++;
                        i11 = size6;
                        o0Var4.animate().translationX((-(size9 - i21)) * AndroidUtilities.dp(23.0f)).setInterpolator(rrVar).setDuration(j3).start();
                    } else {
                        i11 = size6;
                    }
                    size6 = i11;
                }
                i10 = size6;
                if (hg.c.g(1, arrayList6) == o0Var && arrayList6.size() > 1) {
                    ((o0) hg.c.g(2, arrayList6)).f43469b.setScaleY(0.1f);
                    ((o0) arrayList6.get(arrayList6.size() - 2)).f43469b.setScaleX(0.1f);
                    ((o0) arrayList6.get(arrayList6.size() - 2)).f43469b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j3).setInterpolator(rrVar).start();
                    size6 = i10;
                }
            } else {
                i10 = size6;
            }
            size6 = i10;
        }
        o0 o0Var5 = this.f43483b;
        if (o0Var5.d == null) {
            o0Var5.d = chat;
            h9 h9Var2 = o0Var5.e;
            h9Var2.q(chat);
            o0Var5.f43468a.e(chat, h9Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f43484c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(rrVar).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(rrVar).translationX(0.0f).setDuration(200).start();
        }
        o0Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j10 = 200;
            frameLayout.animate().setInterpolator(rrVar).translationX(0.0f).setDuration(j10).start();
            o0Var5.animate().setInterpolator(rrVar).translationX(0.0f).setDuration(j10).start();
            return;
        }
        long j11 = 200;
        frameLayout.animate().setInterpolator(rrVar).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j11).start();
        o0Var5.animate().setInterpolator(rrVar).translationX(AndroidUtilities.dp(48.0f)).setDuration(j11).start();
    }
}
