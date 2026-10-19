package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.o1;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qa1;
import w7.z5;
public final class i0 extends sg.m1 {
    public final ArrayList Q0;

    public i0(n2 n2Var, int i10, ArrayList arrayList, d6 d6Var) {
        super(n2Var, i10, null, null, null, d6Var);
        ArrayList arrayList2 = new ArrayList();
        this.Q0 = arrayList2;
        arrayList2.addAll(arrayList);
        c0();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
        aVar.setOnClickListener(new hg.r0(this, 23));
        aVar.setCloseStyle(true);
        this.containerView.addView(aVar, z5.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        im0 im0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        im0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i12 = h0.f47680f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, z5.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            h0 h0Var = new h0(context, 47.0f);
            h0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            h9 h9Var = h0Var.e;
            h9Var.r(user);
            h0Var.f47681a.e(user, h9Var);
            frameLayout2.addView(h0Var, 0, z5.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, z5.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i13 = 0;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i14);
                h0 h0Var2 = new h0(context, 41.5f);
                h9 h9Var2 = h0Var2.e;
                h9Var2.r(user2);
                h0Var2.f47681a.e(user2, h9Var2);
                frameLayout2.addView(h0Var2, 0, z5.e(83, 83, 17));
                h0Var2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i14));
                if (i14 == 0 && arrayList2.size() > 3) {
                    g0 g0Var = h0Var2.f47682b;
                    g0Var.setAlpha(1.0f);
                    g0Var.f47679b = arrayList2.size() - 3;
                }
                i13++;
                if (i14 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i13 - 1) * AndroidUtilities.dp(14.5f));
        }
        this.B0 = frameLayout;
        fixNavigationBar();
    }

    public static void d0(ArrayList arrayList) {
        n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        i0 i0Var = new i0(R, UserConfig.selectedAccount, arrayList, R.getResourceProvider());
        i0Var.J0 = true;
        i0Var.K0 = true;
        i0Var.show();
    }

    @Override
    public final void W(int i10, View view) {
        if (i10 == 0) {
            view.setOutlineProvider(new o1(21));
            view.setClipToOutline(true);
            view.setBackgroundColor(h6.w0(h6.f20929a7, this.resourcesProvider));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override
    public final void X(qa1 qa1Var) {
        int i10;
        float f7;
        float f10;
        View view = this.B0;
        ArrayList arrayList = this.Q0;
        if (arrayList.size() == 1) {
            i10 = 94;
        } else {
            i10 = 83;
        }
        int i11 = i10;
        if (arrayList.size() == 1) {
            f7 = 28.0f;
        } else {
            f7 = 34.0f;
        }
        float f11 = f7;
        if (arrayList.size() == 1) {
            f10 = 9.0f;
        } else {
            f10 = 14.0f;
        }
        qa1Var.addView(view, z5.k(0.0f, f11, 0.0f, f10, -1, i11));
    }

    @Override
    public final void b0(boolean z10) {
        String formatString;
        this.O0[0].setTextSize(1, 20.0f);
        this.P0.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        x90 x90Var = this.O0[0];
        ArrayList arrayList = this.Q0;
        x90Var.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).topMargin = AndroidUtilities.dp(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    formatString = LocaleController.formatPluralString("GiftPremiumUsersPurchasedMany", arrayList.size() - 3, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
                } else {
                    formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
                }
            } else {
                formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersTwo", R.string.GiftPremiumUsersTwo, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1))));
            }
        } else {
            formatString = LocaleController.formatString(R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString(R.string.GiftPremiumUsersOne, UserObject.getFirstName((TLRPC.User) arrayList.get(0))));
        }
        this.P0.setText(AndroidUtilities.replaceTags(formatString));
        this.P0.append("\n");
        this.P0.append("\n");
        if (arrayList.size() == 1) {
            this.P0.append(AndroidUtilities.replaceTags(LocaleController.formatString("GiftPremiumGiftsSentStatusForUser", R.string.GiftPremiumGiftsSentStatusForUser, UserObject.getFirstName((TLRPC.User) arrayList.get(0)))));
        } else {
            this.P0.append(AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumGiftsSentStatus", R.string.GiftPremiumGiftsSentStatus)));
        }
    }

    @Override
    public final void c0() {
        this.f46327f0 = 1;
        this.f46328g0 = 0;
        this.f46331j0 = 1;
        int size = this.X.size();
        int i10 = 1 + size;
        this.f46332k0 = i10;
        this.f46327f0 = size + 2;
        this.f46334n0 = i10;
    }
}
