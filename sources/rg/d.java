package rg;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.rk;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.u41;
import w7.y5;
public final class d extends ul0 {
    public final f6 f42565c;
    public final int d;
    public final int e;
    public final ArrayList f42566f;
    public final z0 h;
    public int f42567n;
    public c f42568r;
    public final boolean f42569s;

    public d(int i10, f6 f6Var) {
        ArrayList arrayList = new ArrayList();
        this.f42566f = arrayList;
        this.f42569s = true;
        this.f42565c = f6Var;
        z0 z0Var = new z0(j6.Lj, j6.Mj, j6.Nj, j6.Oj, f6Var);
        this.h = z0Var;
        z0Var.f42862o = 0.0f;
        z0Var.f42863p = 0.0f;
        z0Var.f42864q = 1.0f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        arrayList.add(new e(messagesController.channelsLimitDefault, messagesController.channelsLimitPremium, LocaleController.getString(R.string.GroupsAndChannelsLimitTitle), LocaleController.formatString(R.string.GroupsAndChannelsLimitSubtitle, Integer.valueOf(messagesController.channelsLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersPinnedLimitDefault, messagesController.dialogFiltersPinnedLimitPremium, LocaleController.getString(R.string.PinChatsLimitTitle), LocaleController.formatString(R.string.PinChatsLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium))));
        arrayList.add(new e(messagesController.publicLinksLimitDefault, messagesController.publicLinksLimitPremium, LocaleController.getString(R.string.PublicLinksLimitTitle), LocaleController.formatString(R.string.PublicLinksLimitSubtitle, Integer.valueOf(messagesController.publicLinksLimitPremium))));
        arrayList.add(new e(messagesController.savedGifsLimitDefault, messagesController.savedGifsLimitPremium, LocaleController.getString(R.string.SavedGifsLimitTitle), LocaleController.formatString(R.string.SavedGifsLimitSubtitle, Integer.valueOf(messagesController.savedGifsLimitPremium))));
        arrayList.add(new e(messagesController.stickersFavedLimitDefault, messagesController.stickersFavedLimitPremium, LocaleController.getString(R.string.FavoriteStickersLimitTitle), LocaleController.formatString(R.string.FavoriteStickersLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.aboutLengthLimitDefault, messagesController.aboutLengthLimitPremium, LocaleController.getString(R.string.BioLimitTitle), LocaleController.formatString(R.string.BioLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.captionLengthLimitDefault, messagesController.captionLengthLimitPremium, LocaleController.getString(R.string.CaptionsLimitTitle), LocaleController.formatString(R.string.CaptionsLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersLimitDefault, messagesController.dialogFiltersLimitPremium, LocaleController.getString(R.string.FoldersLimitTitle), LocaleController.formatString(R.string.FoldersLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersChatsLimitDefault, messagesController.dialogFiltersChatsLimitPremium, LocaleController.getString(R.string.ChatPerFolderLimitTitle), LocaleController.formatString(R.string.ChatPerFolderLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersChatsLimitPremium))));
        arrayList.add(new e(3, 4, LocaleController.getString(R.string.ConnectedAccountsLimitTitle), LocaleController.formatString(R.string.ConnectedAccountsLimitSubtitle, 4)));
        arrayList.add(new e(messagesController.recommendedChannelsLimitDefault, messagesController.recommendedChannelsLimitPremium, LocaleController.getString(R.string.SimilarChannelsLimitTitle), LocaleController.formatString(R.string.SimilarChannelsLimitSubtitle, Integer.valueOf(messagesController.recommendedChannelsLimitPremium))));
        this.d = 1;
        this.e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f42977f == 0) {
            f fVar = (f) c1Var.f42974a;
            int i11 = i10 - this.e;
            ArrayList arrayList = this.f42566f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f42583c;
            limitPreviewView.F = ((e) arrayList.get(i11)).e;
            limitPreviewView.f22326c = this.f42567n;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        u3 u3Var;
        Context context = viewGroup.getContext();
        f6 f6Var = this.f42565c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, f6Var);
                fVar.f42583c.setParentViewForGradien(this.f42568r);
                fVar.f42583c.setStaticGradinet(this.h);
                u3Var = fVar;
            } else {
                u3Var = new u3(context, 16);
            }
        } else if (this.f42569s) {
            ?? u41Var = new u41(context, 11);
            LinearLayout f7 = rk.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(a1.c(context.getDrawable(R.drawable.other_2x_large), a1.d().f42544a));
            f7.addView(imageView, y5.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(j6.v0(j6.G6, f6Var));
            textView.setTypeface(AndroidUtilities.bold());
            f7.addView(textView, y5.e(-2, -2, 16));
            u41Var.addView(f7, y5.e(-2, -2, 17));
            u3Var = u41Var;
        } else {
            u3Var = new u3(context, 64);
        }
        return e2.k(u3Var, u3Var, -1, -2);
    }
}
