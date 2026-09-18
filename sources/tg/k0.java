package tg;

import ai.k2;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dc1;
import w7.x5;
public final class k0 extends rg.k1 {
    public final ArrayList Q0;

    public k0(o2 o2Var, int i10, ArrayList arrayList, f6 f6Var) {
        super(o2Var, i10, null, null, null, f6Var);
        ArrayList arrayList2 = new ArrayList();
        this.Q0 = arrayList2;
        arrayList2.addAll(arrayList);
        b0();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
        aVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 12));
        aVar.setCloseStyle(true);
        this.containerView.addView(aVar, x5.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        ml0 ml0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i12 = j0.f43181f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, x5.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            j0 j0Var = new j0(context, 47.0f);
            j0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            f9 f9Var = j0Var.e;
            f9Var.r(user);
            j0Var.f43182a.e(user, f9Var);
            frameLayout2.addView(j0Var, 0, x5.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, x5.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i13 = 0;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i14);
                j0 j0Var2 = new j0(context, 41.5f);
                f9 f9Var2 = j0Var2.e;
                f9Var2.r(user2);
                j0Var2.f43182a.e(user2, f9Var2);
                frameLayout2.addView(j0Var2, 0, x5.e(83, 83, 17));
                j0Var2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i14));
                if (i14 == 0 && arrayList2.size() > 3) {
                    i0 i0Var = j0Var2.f43183b;
                    i0Var.setAlpha(1.0f);
                    i0Var.f43180b = arrayList2.size() - 3;
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

    public static void c0(ArrayList arrayList) {
        o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        k0 k0Var = new k0(R, UserConfig.selectedAccount, arrayList, R.getResourceProvider());
        k0Var.J0 = true;
        k0Var.K0 = true;
        k0Var.show();
    }

    @Override
    public final void V(int i10, View view) {
        if (i10 == 0) {
            view.setOutlineProvider(new k2(19));
            view.setClipToOutline(true);
            view.setBackgroundColor(j6.v0(j6.f18807a7, this.resourcesProvider));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override
    public final void W(dc1 dc1Var) {
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
        if (arrayList.size() == 1) {
            f7 = 28.0f;
        } else {
            f7 = 34.0f;
        }
        if (arrayList.size() == 1) {
            f10 = 9.0f;
        } else {
            f10 = 14.0f;
        }
        dc1Var.addView(view, x5.k(0.0f, f7, 0.0f, f10, -1, i10));
    }

    @Override
    public final void a0(boolean z10) {
        String formatString;
        this.O0[0].setTextSize(1, 20.0f);
        this.P0.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        c90 c90Var = this.O0[0];
        ArrayList arrayList = this.Q0;
        c90Var.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
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
    public final void b0() {
        this.f42376f0 = 1;
        this.f42377g0 = 0;
        this.f42380j0 = 1;
        int size = this.X.size();
        int i10 = 1 + size;
        this.f42381k0 = i10;
        this.f42376f0 = size + 2;
        this.f42383n0 = i10;
    }
}
