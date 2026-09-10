package qg;

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
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.m91;
import w7.a6;
public final class d extends ul0 {
    public final f6 f40701c;
    public final int d;
    public final int e;
    public final ArrayList f40702f;
    public final c1 h;
    public int f40703n;
    public c f40704r;
    public final boolean f40705s;

    public d(int i10, f6 f6Var) {
        ArrayList arrayList = new ArrayList();
        this.f40702f = arrayList;
        this.f40705s = true;
        this.f40701c = f6Var;
        c1 c1Var = new c1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, f6Var);
        this.h = c1Var;
        c1Var.f40698o = 0.0f;
        c1Var.f40699p = 0.0f;
        c1Var.f40700q = 1.0f;
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
        if (c1Var.f41613f == 0) {
            f fVar = (f) c1Var.f41610a;
            int i11 = i10 - this.e;
            ArrayList arrayList = this.f40702f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f40730c;
            limitPreviewView.F = ((e) arrayList.get(i11)).e;
            limitPreviewView.f21190c = this.f40703n;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s3 s3Var;
        Context context = viewGroup.getContext();
        f6 f6Var = this.f40701c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, f6Var);
                fVar.f40730c.setParentViewForGradien(this.f40704r);
                fVar.f40730c.setStaticGradinet(this.h);
                s3Var = fVar;
            } else {
                s3Var = new s3(context, 16);
            }
        } else if (this.f40705s) {
            ?? m91Var = new m91(context, 9);
            LinearLayout f7 = em.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(d1.c(context.getDrawable(R.drawable.other_2x_large), d1.d().f40708a));
            f7.addView(imageView, a6.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(j6.v0(j6.G6, f6Var));
            textView.setTypeface(AndroidUtilities.bold());
            f7.addView(textView, a6.e(-2, -2, 16));
            m91Var.addView(f7, a6.e(-2, -2, 17));
            s3Var = m91Var;
        } else {
            s3Var = new s3(context, 64);
        }
        return e2.j(s3Var, s3Var, -1, -2);
    }
}
