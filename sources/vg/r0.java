package vg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.z90;
import org.telegram.ui.d3;
public final class r0 extends LinearLayout {
    public final ArrayList f50248a;
    public final o0 f50249b;
    public final FrameLayout f50250c;
    public final FrameLayout d;
    public final z90 e;

    public r0(Context context) {
        super(context);
        this.f50248a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f50250c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, gb1.h(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        ImageView imageView = new ImageView(frameLayout3.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        f7.t(imageView, y6.E6, null, PorterDuff.Mode.SRC_ATOP);
        frameLayout3.addView(imageView);
        frameLayout.addView(frameLayout3, gb1.i(24, 24, 17));
        o0 o0Var = new o0(context);
        this.f50249b = o0Var;
        o0Var.setLayerType(2, null);
        frameLayout.addView(o0Var, gb1.i(70, 70, 17));
        addView(frameLayout, gb1.o(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        d3.o(R.string.BoostingReassignBoost, textView, 1, 20.0f);
        f7.V(textView, y6.G6, null);
        addView(textView, gb1.x(-2, -2, 1, 0, 15, 0, 7));
        z90 z90Var = new z90(getContext(), null);
        this.e = z90Var;
        z90Var.setTextSize(1, 14.0f);
        z90Var.setGravity(1);
        f7.V(z90Var, y6.f23462j5, null);
        z90Var.setLineSpacing(z90Var.getLineSpacingExtra(), z90Var.getLineSpacingMultiplier() * 1.1f);
        addView(z90Var, gb1.x(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        char c10;
        o0 o0Var;
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
        ds dsVar = ds.f27584f;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.f50248a;
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
        while (true) {
            c10 = 2;
            if (i17 >= size4) {
                break;
            }
            Object obj4 = arrayList5.get(i17);
            i17++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            o0 o0Var3 = new o0(getContext());
            o0Var3.setLayerType(2, null);
            o0Var3.d = chat4;
            j9 j9Var = o0Var3.e;
            j9Var.q(chat4);
            o0Var3.f50234a.f(chat4, j9Var);
            int size5 = arrayList6.size();
            frameLayout.addView(o0Var3, i12, gb1.i(70, 70, 17));
            o0Var3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
            o0Var3.setAlpha(0.0f);
            o0Var3.setScaleX(0.1f);
            o0Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            o0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(dsVar).setDuration(200).start();
            if (size5 == 0) {
                p0 p0Var = o0Var3.f50235b;
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
                long j10 = 200;
                o0Var.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(dsVar).setDuration(j10).setListener(new q0(this, o0Var)).start();
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
                        o0Var4.animate().translationX((-(size9 - i21)) * AndroidUtilities.dp(23.0f)).setInterpolator(dsVar).setDuration(j10).start();
                    } else {
                        i11 = size6;
                    }
                    size6 = i11;
                }
                i10 = size6;
                if (ic.a.g(1, arrayList6) == o0Var && arrayList6.size() > 1) {
                    c11 = 2;
                    ((o0) ic.a.g(2, arrayList6)).f50235b.setScaleY(0.1f);
                    ((o0) arrayList6.get(arrayList6.size() - 2)).f50235b.setScaleX(0.1f);
                    ((o0) arrayList6.get(arrayList6.size() - 2)).f50235b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j10).setInterpolator(dsVar).start();
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
        o0 o0Var5 = this.f50249b;
        if (o0Var5.d == null) {
            o0Var5.d = chat;
            j9 j9Var2 = o0Var5.e;
            j9Var2.q(chat);
            o0Var5.f50234a.f(chat, j9Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f50250c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(dsVar).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(dsVar).translationX(0.0f).setDuration(200).start();
        }
        o0Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j11 = 200;
            frameLayout.animate().setInterpolator(dsVar).translationX(0.0f).setDuration(j11).start();
            o0Var5.animate().setInterpolator(dsVar).translationX(0.0f).setDuration(j11).start();
            return;
        }
        long j12 = 200;
        frameLayout.animate().setInterpolator(dsVar).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j12).start();
        o0Var5.animate().setInterpolator(dsVar).translationX(AndroidUtilities.dp(48.0f)).setDuration(j12).start();
    }
}
