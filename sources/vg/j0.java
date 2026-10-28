package vg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.za1;
public final class j0 extends tg.m1 {
    public final ArrayList Q0;

    public j0(r2 r2Var, int i10, ArrayList arrayList, u6 u6Var) {
        super(r2Var, i10, null, null, null, u6Var);
        ArrayList arrayList2 = new ArrayList();
        this.Q0 = arrayList2;
        arrayList2.addAll(arrayList);
        h0();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        xg.a aVar = new xg.a(getContext(), this.resourcesProvider);
        aVar.setOnClickListener(new ig.d0(this, 24));
        aVar.setCloseStyle(true);
        this.containerView.addView(aVar, kb1.h(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        nm0 nm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i12 = i0.f50217f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, kb1.h(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            i0 i0Var = new i0(context, 47.0f);
            i0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            j9 j9Var = i0Var.e;
            j9Var.r(user);
            i0Var.f50218a.f(user, j9Var);
            frameLayout2.addView(i0Var, 0, kb1.i(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, kb1.h(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i13 = 0;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i14);
                i0 i0Var2 = new i0(context, 41.5f);
                j9 j9Var2 = i0Var2.e;
                j9Var2.r(user2);
                i0Var2.f50218a.f(user2, j9Var2);
                frameLayout2.addView(i0Var2, 0, kb1.i(83, 83, 17));
                i0Var2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i14));
                if (i14 == 0 && arrayList2.size() > 3) {
                    h0 h0Var = i0Var2.f50219b;
                    h0Var.setAlpha(1.0f);
                    h0Var.f50216b = arrayList2.size() - 3;
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

    public static void i0(ArrayList arrayList) {
        r2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        j0 j0Var = new j0(R, UserConfig.selectedAccount, arrayList, R.getResourceProvider());
        j0Var.J0 = true;
        j0Var.K0 = true;
        j0Var.show();
    }

    @Override
    public final void a0(int i10, View view) {
        if (i10 == 0) {
            view.setOutlineProvider(new ag.v0(23));
            view.setClipToOutline(true);
            f7.i(y6.f23300a7, view, this.resourcesProvider);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override
    public final void b0(za1 za1Var) {
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
        za1Var.addView(view, kb1.o(0.0f, f11, 0.0f, f10, -1, i11));
    }

    @Override
    public final void g0(boolean z10) {
        String formatString;
        this.O0[0].setTextSize(1, 20.0f);
        this.P0.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        aa0 aa0Var = this.O0[0];
        ArrayList arrayList = this.Q0;
        aa0Var.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
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
    public final void h0() {
        this.f48973f0 = 1;
        this.f48974g0 = 0;
        this.f48977j0 = 1;
        int size = this.X.size();
        int i10 = 1 + size;
        this.f48978k0 = i10;
        this.f48973f0 = size + 2;
        this.f48980n0 = i10;
    }
}
