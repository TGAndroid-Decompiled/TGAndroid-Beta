package zh;

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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.ua;
public final class v3 extends ua {
    public final ArrayList f52712a0;
    public final LimitPreviewView f52713b0;

    public v3(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        float f7;
        int i10;
        this.f52712a0 = arrayList;
        float f10 = this.backgroundPaddingLeft / AndroidUtilities.density;
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, f6Var, 0);
        this.f52713b0 = limitPreviewView;
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        limitPreviewView.setIconScale(1.8f);
        float f11 = f10;
        this.X.addView(limitPreviewView, w7.x5.r(-1, -2, 17, f11, 20.0f, f11, 10.0f));
        P(j3);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
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
        oz0 oz0Var = new oz0(context, f6Var);
        int i12 = 0;
        boolean z10 = false;
        while (i12 < arrayList.size()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(i12);
            if (currentTime > starGiftUpgradePrice.date && ((i10 = i12 + 1) >= arrayList.size() || currentTime > ((TL_stars.StarGiftUpgradePrice) arrayList.get(i10)).date)) {
                f7 = f11;
            } else {
                f7 = f11;
                Date date = new Date(starGiftUpgradePrice.date * 1000);
                oz0Var.c(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), v7.X0(false, i2.g.k((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                z10 = true;
            }
            i12++;
            f11 = f7;
        }
        float f12 = f11;
        if (!z10) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                Date date2 = new Date(starGiftUpgradePrice2.date * 1000);
                oz0Var.c(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), v7.X0(false, i2.g.k((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
            }
        }
        float f13 = f12 + 14.0f;
        this.X.addView(oz0Var, w7.x5.r(-1, -2, 7, f13, 16.0f, f13, 15.0f));
        TextView b12 = w7.b6.b(context, 12.0f, org.telegram.ui.ActionBar.j6.f21042y6, false, null);
        b12.setGravity(17);
        b12.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
        this.X.addView(b12, w7.x5.t(-1, -2, 17, 32, 0, 32, 15));
        float f14 = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Y = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, this.resourcesProvider));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d7, this.resourcesProvider));
        this.Y.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        di.d dVar = new di.d(getContext(), this.resourcesProvider, true);
        this.Z = dVar;
        float f15 = f14 + 16.0f;
        this.Y.addView(dVar, w7.x5.d(-1, 48.0f, 119, f15, 16.0f, f15, 16.0f));
        this.containerView.addView(this.Y, w7.x5.e(-1, -2, 87));
        ll0 ll0Var = this.d;
        ll0Var.setPadding(ll0Var.getPaddingLeft(), ll0Var.getPaddingTop(), ll0Var.getPaddingRight(), AndroidUtilities.dp(80.0f) + ll0Var.getPaddingBottom());
        this.Z.g(w3.g2(LocaleController.getString(R.string.Understood)), false, true);
        this.Z.setOnClickListener(new ji.m4(this, 26));
    }

    public final void P(long j3) {
        int v02;
        ArrayList arrayList = this.f52712a0;
        if (arrayList != null && !arrayList.isEmpty()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(0);
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) i2.g.h(1, arrayList);
            LimitPreviewView limitPreviewView = this.f52713b0;
            limitPreviewView.M = true;
            Paint paint = limitPreviewView.K;
            int i10 = org.telegram.ui.ActionBar.j6.Oh;
            org.telegram.ui.ActionBar.f6 f6Var = limitPreviewView.S;
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            limitPreviewView.f24045a = AndroidUtilities.ilerp((float) j3, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
            org.telegram.ui.Components.q6 q6Var = limitPreviewView.N;
            q6Var.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
            org.telegram.ui.Components.q6 q6Var2 = limitPreviewView.v;
            q6Var2.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars));
            ((FrameLayout.LayoutParams) q6Var2.getLayoutParams()).gravity = 5;
            limitPreviewView.setType(17);
            limitPreviewView.f24064w.setVisibility(8);
            limitPreviewView.O.setVisibility(8);
            if (limitPreviewView.L) {
                v02 = -1;
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var);
            }
            q6Var2.setTextColor(v02);
            q6Var.setTextColor(-1);
            limitPreviewView.g((int) j3, false);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = true;
        }
    }
}
