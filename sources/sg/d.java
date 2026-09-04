package sg;

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
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.v51;
import w7.x5;
public final class d extends kl0 {
    public final f6 f46057c;
    public final int d;
    public final int f46058e;
    public final ArrayList f46059f;
    public final c1 h;
    public int f46060n;
    public c f46061r;
    public final boolean f46062s;

    public d(int i10, f6 f6Var) {
        ArrayList arrayList = new ArrayList();
        this.f46059f = arrayList;
        this.f46062s = true;
        this.f46057c = f6Var;
        c1 c1Var = new c1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, f6Var);
        this.h = c1Var;
        c1Var.f46043o = 0.0f;
        c1Var.f46044p = 0.0f;
        c1Var.f46045q = 1.0f;
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
        this.f46058e = 1;
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
        if (c1Var.f45742f == 0) {
            f fVar = (f) c1Var.f45738a;
            int i11 = i10 - this.f46058e;
            ArrayList arrayList = this.f46059f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f46090c;
            limitPreviewView.F = ((e) arrayList.get(i11)).f46075e;
            limitPreviewView.f24049c = this.f46060n;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s3 s3Var;
        Context context = viewGroup.getContext();
        f6 f6Var = this.f46057c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, f6Var);
                fVar.f46090c.setParentViewForGradien(this.f46061r);
                fVar.f46090c.setStaticGradinet(this.h);
                s3Var = fVar;
            } else {
                s3Var = new s3(context, 16);
            }
        } else if (this.f46062s) {
            ?? v51Var = new v51(context, 10);
            LinearLayout f7 = wl.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(d1.c(context.getDrawable(R.drawable.other_2x_large), d1.d().f46065a));
            f7.addView(imageView, x5.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(j6.v0(j6.G6, f6Var));
            textView.setTypeface(AndroidUtilities.bold());
            f7.addView(textView, x5.e(-2, -2, 16));
            v51Var.addView(f7, x5.e(-2, -2, 17));
            s3Var = v51Var;
        } else {
            s3Var = new s3(context, 64);
        }
        return e2.l(s3Var, s3Var, -1, -2);
    }
}
