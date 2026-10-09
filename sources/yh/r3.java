package yh;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.xa;
public final class r3 extends xa {
    public final ArrayList f53123a0;
    public final LimitPreviewView f53124b0;

    public r3(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        float f7;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        float f10;
        int i10;
        this.f53123a0 = arrayList;
        float f11 = this.backgroundPaddingLeft / AndroidUtilities.density;
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, e6Var, 0);
        this.f53124b0 = limitPreviewView;
        float f12 = 14.0f;
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        limitPreviewView.setIconScale(1.8f);
        float f13 = f11;
        this.X.addView(limitPreviewView, w7.x5.r(-1, -2, 17, f13, 20.0f, f13, 10.0f));
        Q(j3);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        TextView b10 = w7.b6.b(context, 20.0f, i11, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        setTitle(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        this.X.addView(b10, w7.x5.t(-1, -2, 17, 32, 0, 32, 0));
        TextView b11 = w7.b6.b(context, 14.0f, i11, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
        this.X.addView(b11, w7.x5.t(-1, -2, 17, 32, 10, 32, 10));
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        r01 r01Var = new r01(context, e6Var);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            f7 = f12;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (currentTime > ((TL_stars.StarGiftUpgradePrice) arrayList.get(i12)).date && ((i10 = i12 + 1) >= arrayList.size() || currentTime > ((TL_stars.StarGiftUpgradePrice) arrayList.get(i10)).date)) {
                f10 = f13;
            } else {
                f10 = f13;
                Date date = new Date(starGiftUpgradePrice.date * 1000);
                r01Var.c(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), p7.Y0(false, org.telegram.messenger.q.h((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                z10 = true;
            }
            i12++;
            f12 = f7;
            f13 = f10;
        }
        float f14 = f13;
        if (!z10) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                Date date2 = new Date(starGiftUpgradePrice2.date * 1000);
                r01Var.c(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), p7.Y0(false, org.telegram.messenger.q.h((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
            }
        }
        float f15 = f14 + f7;
        this.X.addView(r01Var, w7.x5.r(-1, -2, 7, f15, 16.0f, f15, 15.0f));
        TextView b12 = w7.b6.b(context, 12.0f, org.telegram.ui.ActionBar.i6.f21181y6, false, null);
        b12.setGravity(17);
        b12.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
        this.X.addView(b12, w7.x5.t(-1, -2, 17, 32, 0, 32, 15));
        float f16 = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Y = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, this.resourcesProvider));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20798d7, this.resourcesProvider));
        this.Y.addView(view, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ci.d dVar = new ci.d(getContext(), this.resourcesProvider, true);
        this.Z = dVar;
        float f17 = f16 + 16.0f;
        this.Y.addView(dVar, w7.x5.a(48.0f, f17, 16.0f, f17, 16.0f, -1, 119));
        this.containerView.addView(this.Y, w7.x5.e(-1, -2, 87));
        qm0 qm0Var = this.d;
        qm0Var.setPadding(qm0Var.getPaddingLeft(), qm0Var.getPaddingTop(), qm0Var.getPaddingRight(), AndroidUtilities.dp(80.0f) + qm0Var.getPaddingBottom());
        this.Z.g(s3.i2(LocaleController.getString(R.string.Understood)), false, true);
        this.Z.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 25));
    }

    public final void Q(long j3) {
        int w02;
        ArrayList arrayList = this.f53123a0;
        if (arrayList != null && !arrayList.isEmpty()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(0);
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) hg.c.g(1, arrayList);
            LimitPreviewView limitPreviewView = this.f53124b0;
            limitPreviewView.M = true;
            Paint paint = limitPreviewView.K;
            int i10 = org.telegram.ui.ActionBar.i6.Oh;
            org.telegram.ui.ActionBar.e6 e6Var = limitPreviewView.S;
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
            limitPreviewView.f24235a = AndroidUtilities.ilerp((float) j3, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
            org.telegram.ui.Components.r6 r6Var = limitPreviewView.N;
            r6Var.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
            org.telegram.ui.Components.r6 r6Var2 = limitPreviewView.v;
            r6Var2.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars));
            ((FrameLayout.LayoutParams) r6Var2.getLayoutParams()).gravity = 5;
            limitPreviewView.setType(17);
            limitPreviewView.f24254w.setVisibility(8);
            limitPreviewView.O.setVisibility(8);
            if (limitPreviewView.L) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var);
            }
            r6Var2.setTextColor(w02);
            r6Var.setTextColor(-1);
            limitPreviewView.g((int) j3, false);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = true;
        }
    }
}
