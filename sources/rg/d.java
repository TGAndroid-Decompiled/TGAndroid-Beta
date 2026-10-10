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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.w51;
import w7.x5;
public final class d extends qm0 {
    public final e6 f47269c;
    public final int d;
    public final int f47270e;
    public final ArrayList f47271f;
    public final a1 h;
    public int f47272n;
    public c f47273r;
    public final boolean f47274s;

    public d(int i10, e6 e6Var) {
        ArrayList arrayList = new ArrayList();
        this.f47271f = arrayList;
        this.f47274s = true;
        this.f47269c = e6Var;
        a1 a1Var = new a1(i6.Lj, i6.Mj, i6.Nj, i6.Oj, e6Var);
        this.h = a1Var;
        a1Var.f47231o = 0.0f;
        a1Var.f47232p = 0.0f;
        a1Var.f47233q = 1.0f;
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
        this.f47270e = 1;
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
        if (d1Var.f47706f == 0) {
            f fVar = (f) d1Var.f47702a;
            int i11 = i10 - this.f47270e;
            ArrayList arrayList = this.f47271f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f47289c;
            limitPreviewView.F = ((e) arrayList.get(i11)).f47279e;
            limitPreviewView.f24243c = this.f47272n;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        t3 t3Var;
        Context context = viewGroup.getContext();
        e6 e6Var = this.f47269c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, e6Var);
                fVar.f47289c.setParentViewForGradien(this.f47273r);
                fVar.f47289c.setStaticGradinet(this.h);
                t3Var = fVar;
            } else {
                t3Var = new t3(context, 16);
            }
        } else if (this.f47274s) {
            ?? w51Var = new w51(context, 10);
            LinearLayout e7 = bi.e(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(b1.c(context.getDrawable(R.drawable.other_2x_large), b1.d().f47250a));
            e7.addView(imageView, x5.a(28.0f, 0.0f, 0.0f, 8.0f, 0.0f, 40, 16));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(i6.w0(i6.G6, e6Var));
            textView.setTypeface(AndroidUtilities.bold());
            e7.addView(textView, x5.e(-2, -2, 16));
            w51Var.addView(e7, x5.e(-2, -2, 17));
            t3Var = w51Var;
        } else {
            t3Var = new t3(context, 64);
        }
        return e2.k(t3Var, t3Var, -1, -2);
    }
}
