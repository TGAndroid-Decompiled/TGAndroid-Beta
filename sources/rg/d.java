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
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.z51;
import w7.w5;
public final class d extends vm0 {
    public final c6 f47447c;
    public final int d;
    public final int f47448e;
    public final ArrayList f47449f;
    public final a1 h;
    public int f47450n;
    public c f47451r;
    public final boolean f47452s;

    public d(int i10, c6 c6Var) {
        ArrayList arrayList = new ArrayList();
        this.f47449f = arrayList;
        this.f47452s = true;
        this.f47447c = c6Var;
        a1 a1Var = new a1(h6.Lj, h6.Mj, h6.Nj, h6.Oj, c6Var);
        this.h = a1Var;
        a1Var.f47409o = 0.0f;
        a1Var.f47410p = 0.0f;
        a1Var.f47411q = 1.0f;
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
        this.f47448e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
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
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47901f == 0) {
            f fVar = (f) d1Var.f47897a;
            int i11 = i10 - this.f47448e;
            ArrayList arrayList = this.f47449f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f47467c;
            limitPreviewView.F = ((e) arrayList.get(i11)).f47457e;
            limitPreviewView.f24017c = this.f47450n;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        t3 t3Var;
        Context context = viewGroup.getContext();
        c6 c6Var = this.f47447c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, c6Var);
                fVar.f47467c.setParentViewForGradien(this.f47451r);
                fVar.f47467c.setStaticGradinet(this.h);
                t3Var = fVar;
            } else {
                t3Var = new t3(context, 16);
            }
        } else if (this.f47452s) {
            ?? z51Var = new z51(context, 10);
            LinearLayout e7 = am.e(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(b1.c(context.getDrawable(R.drawable.other_2x_large), b1.d().f47428a));
            e7.addView(imageView, w5.a(28.0f, 0.0f, 0.0f, 8.0f, 0.0f, 40, 16));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(h6.w0(h6.G6, c6Var));
            textView.setTypeface(AndroidUtilities.bold());
            e7.addView(textView, w5.e(-2, -2, 16));
            z51Var.addView(e7, w5.e(-2, -2, 17));
            t3Var = z51Var;
        } else {
            t3Var = new t3(context, 64);
        }
        return e2.k(t3Var, t3Var, -1, -2);
    }
}
