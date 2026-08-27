package qf;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
import java.util.ArrayList;
import java.util.Collections;
import jh.m5;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e80;
import org.telegram.ui.j70;
import org.telegram.ui.rn;

public final class n1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static b2 h;

    public k51 f46393a;

    public final ArrayList f46394b;

    public NumberTextView f46395c;
    public org.telegram.ui.ActionBar.v0 d;

    public int f46396e;

    public boolean f46397f;

    public n1() {
        super(null);
        this.f46394b = new ArrayList();
        this.f46397f = true;
    }

    public static void U(n1 n1Var, int i10, ArrayList arrayList) {
        if (i10 == n1Var.f46396e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((n41) arrayList.get(i11)).G instanceof p1) {
                    ((p1) ((n41) arrayList.get(i11)).G).f46420c = i11;
                }
            }
            q1 q1VarF = q1.f(n1Var.currentAccount);
            ArrayList arrayList2 = q1VarF.f46434b;
            ArrayList arrayList3 = new ArrayList();
            for (int iF = 0; iF < arrayList2.size(); iF = i0.a.f(((p1) arrayList2.get(iF)).f46418a, iF, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new lp0(23));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((p1) arrayList2.get(i12)).f46418a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int iF2 = 0; iF2 < arrayList2.size(); iF2 = i0.a.f(((p1) arrayList2.get(iF2)).f46418a, iF2, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(q1VarF.f46433a).sendRequest(tL_messages_reorderQuickReplies, new m5(19));
                    q1VarF.l();
                    return;
                }
            }
        }
    }

    public static void V(n1 n1Var, ArrayList arrayList, b51 b51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        n41 n41Var = new n41(2);
        n41Var.f30844l = string;
        n41Var.f30847o = string2;
        n41Var.f30845m = "RestrictedEmoji";
        n41Var.f30846n = "📝";
        arrayList.add(n41Var);
        b51Var.U();
        q1 q1VarF = q1.f(n1Var.currentAccount);
        ArrayList arrayList2 = q1VarF.f46434b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((p1) arrayList2.get(i13)).f46419b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((p1) arrayList2.get(i13)).f46419b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(q1VarF.f46433a).quickRepliesLimit) {
            n41 n41VarC = n41.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            n41VarC.f30849q = true;
            arrayList.add(n41VarC);
        }
        n1Var.f46396e = b51Var.M();
        ArrayList arrayList3 = q1.f(n1Var.currentAccount).f46434b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            p1 p1Var = (p1) obj;
            n41 n41Var2 = new n41(16);
            n41Var2.G = p1Var;
            n41Var2.K(n1Var.f46394b.contains(Integer.valueOf(p1Var.f46418a)));
            arrayList.add(n41Var2);
        }
        b51Var.L();
        b51Var.T();
        pa.A(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(n1 n1Var, n41 n41Var, View view) {
        if (n41Var.d == 1) {
            d0(n1Var.getParentActivity(), n1Var.currentAccount, null, null, n1Var.getResourceProvider(), new n6(n1Var, 16));
            return;
        }
        if (n41Var.f49413a == 16 && (n41Var.G instanceof p1)) {
            if (!n1Var.f46394b.isEmpty()) {
                n1Var.e0(n41Var, view);
                return;
            }
            p1 p1Var = (p1) n41Var.G;
            if (p1Var.f46423g) {
                return;
            }
            Bundle bundleG = a9.p.g(5, "chatMode");
            bundleG.putLong("user_id", n1Var.getUserConfig().getClientUserId());
            bundleG.putString("quick_reply", p1Var.f46419b);
            rn rnVar = new rn(bundleG);
            rnVar.nb(p1Var.f46418a);
            n1Var.presentFragment(rnVar);
        }
    }

    public static void X(n1 n1Var) {
        n1Var.f46394b.clear();
        AndroidUtilities.forEachViews((RecyclerView) n1Var.f46393a, (d5.d) new j4.w0(17));
        n1Var.actionBar.s();
        n1Var.f46393a.w1(false);
    }

    public static void d0(Activity activity, int i10, String str, p1 p1Var, c6 c6Var, Utilities.Callback callback) {
        String str2;
        ?? r10;
        n2 n2VarR = LaunchActivity.R();
        Activity activityFindActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        boolean z10 = n2VarR != null && (n2VarR.getFragmentView() instanceof zu0) && ((zu0) n2VarR.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        b2[] b2VarArr = new b2[1];
        AlertDialog$Builder e2Var = z10 ? new e2(activity, 0, c6Var) : new AlertDialog$Builder(activity, 0, c6Var);
        String string = LocaleController.getString((p1Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        b2 b2Var = e2Var.f22702a;
        b2Var.N = string;
        final h1 h1Var = new h1(activity, c6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        h1Var.setTextSize(1, 18.0f);
        if (p1Var == null) {
            str2 = str == null ? "" : str;
        } else {
            str2 = p1Var.f46419b;
        }
        h1Var.setText(str2);
        int i11 = g6.f23161j5;
        h1Var.setTextColor(g6.v0(i11, c6Var));
        h1Var.setHintColor(g6.v0(g6.Xh, c6Var));
        h1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        h1Var.setSingleLine(true);
        h1Var.setFocusable(true);
        h1Var.setLineColors(g6.v0(g6.f23181k6, c6Var), g6.v0(g6.f23198l6, c6Var), g6.v0(g6.f23269p7, c6Var));
        h1Var.setImeOptions(6);
        h1Var.setBackgroundDrawable(null);
        h1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        h1Var.setFilters(new InputFilter[]{new i1()});
        LinearLayout linearLayoutF = y1.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        rl.l(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((p1Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        rl.l(g6.f23284q7, c6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        Runnable[] runnableArr = {new b(e1Var, 6)};
        cg.e1 e1Var = new cg.e1(runnableArr, new ValueAnimator[1], textView2, textView, 16);
        h1Var.addTextChangedListener(new j1(textView2, runnableArr));
        linearLayoutF.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        linearLayoutF.addView(h1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(linearLayoutF);
        b2Var.f22742a = AndroidUtilities.dp(292.0f);
        h1Var.setOnEditorActionListener(new k1(h1Var, i10, p1Var, textView2, e1Var, callback, b2VarArr, currentFocus));
        e2Var.k(LocaleController.getString(R.string.Done), new e80(h1Var, e1Var, i10, p1Var, textView2, callback));
        e2Var.h(LocaleController.getString(R.string.Cancel), new j70(22));
        if (z10) {
            h = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new o(1, currentFocus));
            b2 b2Var2 = h;
            r10 = 0;
            final boolean z11 = false ? 1 : 0;
            b2Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z11) {
                        case 0:
                            h1 h1Var2 = h1Var;
                            h1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var2);
                            break;
                        default:
                            h1 h1Var3 = h1Var;
                            h1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var3);
                            break;
                    }
                }
            });
            h.q(250L);
        } else {
            r10 = 0;
            b2Var.K = new n6(h1Var, 17);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new ag.j0(h1Var, 12));
            final int i12 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            h1 h1Var2 = h1Var;
                            h1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var2);
                            break;
                        default:
                            h1 h1Var3 = h1Var;
                            h1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var3);
                            break;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[r10].f22748d0 = r10;
        h1Var.setSelection(h1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new g1(this));
        org.telegram.ui.ActionBar.z zVarJ = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f46395c = numberTextView;
        numberTextView.setTextSize(18);
        this.f46395c.setTypeface(AndroidUtilities.bold());
        this.f46395c.setTextColor(g6.w0(null, g6.f23425y8, false));
        zVarJ.addView(this.f46395c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.f46395c.setOnTouchListener(new kh.e(2));
        org.telegram.ui.ActionBar.v0 v0VarA = zVarJ.a(1, R.drawable.msg_edit);
        this.d = v0VarA;
        v0VarA.setContentDescription(LocaleController.getString(R.string.Edit));
        zVarJ.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        d51 d51Var = new d51(context, null, 5);
        d51Var.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        final int i10 = 0;
        k51 k51Var = new k51(this, new Utilities.Callback2(this) {

            public final n1 f46266b;

            {
                this.f46266b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        n1.V(this.f46266b, (ArrayList) obj, (b51) obj2);
                        break;
                    default:
                        n1.U(this.f46266b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new e1(this), new e1(this));
        this.f46393a = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.f46393a;
        k51Var2.U2.f26942r = false;
        final int i11 = 1;
        k51Var2.B1(new Utilities.Callback2(this) {

            public final n1 f46266b;

            {
                this.f46266b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        n1.V(this.f46266b, (ArrayList) obj, (b51) obj2);
                        break;
                    default:
                        n1.U(this.f46266b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        d51Var.addView(this.f46393a, z5.c(-1.0f, -1));
        this.actionBar.B(this.f46393a, true);
        this.fragmentView = d51Var;
        return d51Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        b51 b51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (k51Var = this.f46393a) == null || (b51Var = k51Var.U2) == null) {
            return;
        }
        b51Var.N(true);
    }

    public final void e0(n41 n41Var, View view) {
        p1 p1Var = (p1) n41Var.G;
        m1 m1Var = (m1) view;
        Integer numValueOf = Integer.valueOf(p1Var.f46418a);
        ArrayList arrayList = this.f46394b;
        if (arrayList.contains(numValueOf)) {
            arrayList.remove(Integer.valueOf(p1Var.f46418a));
        } else {
            arrayList.add(Integer.valueOf(p1Var.f46418a));
        }
        this.f46393a.w1(!arrayList.isEmpty());
        boolean zContains = arrayList.contains(Integer.valueOf(p1Var.f46418a));
        n41Var.f30838e = zContains;
        m1Var.d.a(zContains, true);
        if (this.actionBar.t() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.s();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f46395c.a(Math.max(1, arrayList.size()), true);
        boolean z10 = arrayList.size() == 1;
        if (z10) {
            p1 p1VarC = q1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (p1VarC == null || q1.g(p1VarC.f46419b)) ? false : true;
        }
        if (this.f46397f != z10) {
            this.f46397f = z10;
            rl.o(this.d.animate().alpha(this.f46397f ? 1.0f : 0.0f).scaleX(this.f46397f ? 1.0f : 0.7f).scaleY(this.f46397f ? 1.0f : 0.7f), er.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        q1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f46393a.setPadding(0, 0, 0, i13);
        this.f46393a.setClipToPadding(false);
    }
}
