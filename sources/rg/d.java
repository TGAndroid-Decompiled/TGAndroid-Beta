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
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.n41;
import w7.z5;
public final class d extends yl0 {
    public final d6 f46093c;
    public final int d;
    public final int f46094e;
    public final ArrayList f46095f;
    public final a1 h;
    public int f46096n;
    public c f46097r;
    public final boolean f46098s;

    public d(int i10, d6 d6Var) {
        ArrayList arrayList = new ArrayList();
        this.f46095f = arrayList;
        this.f46098s = true;
        this.f46093c = d6Var;
        a1 a1Var = new a1(i6.Lj, i6.Mj, i6.Nj, i6.Oj, d6Var);
        this.h = a1Var;
        a1Var.f46053o = 0.0f;
        a1Var.f46054p = 0.0f;
        a1Var.f46055q = 1.0f;
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
        this.f46094e = 1;
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
        if (c1Var.f46535f == 0) {
            f fVar = (f) c1Var.f46531a;
            int i11 = i10 - this.f46094e;
            ArrayList arrayList = this.f46095f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f46109c;
            limitPreviewView.F = ((e) arrayList.get(i11)).f46103e;
            limitPreviewView.f24240c = this.f46096n;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        t3 t3Var;
        Context context = viewGroup.getContext();
        d6 d6Var = this.f46093c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, d6Var);
                fVar.f46109c.setParentViewForGradien(this.f46097r);
                fVar.f46109c.setStaticGradinet(this.h);
                t3Var = fVar;
            } else {
                t3Var = new t3(context, 16);
            }
        } else if (this.f46098s) {
            ?? n41Var = new n41(context, 11);
            LinearLayout e7 = bi.e(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(b1.c(context.getDrawable(R.drawable.other_2x_large), b1.d().f46063a));
            e7.addView(imageView, z5.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(i6.v0(i6.G6, d6Var));
            textView.setTypeface(AndroidUtilities.bold());
            e7.addView(textView, z5.e(-2, -2, 16));
            n41Var.addView(e7, z5.e(-2, -2, 17));
            t3Var = n41Var;
        } else {
            t3Var = new t3(context, 64);
        }
        return e2.k(t3Var, t3Var, -1, -2);
    }
}
