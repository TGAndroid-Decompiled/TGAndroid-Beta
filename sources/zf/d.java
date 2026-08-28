package zf;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.b81;
public final class d extends vk0 {
    public final b6 f50479c;
    public final int d;
    public final int f50480e;
    public final ArrayList f50481f;
    public final z0 h;
    public int f50482n;
    public c f50483r;
    public final boolean f50484s;

    public d(int i9, b6 b6Var) {
        ArrayList arrayList = new ArrayList();
        this.f50481f = arrayList;
        this.f50484s = true;
        this.f50479c = b6Var;
        z0 z0Var = new z0(f6.Lj, f6.Mj, f6.Nj, f6.Oj, b6Var);
        this.h = z0Var;
        z0Var.f50800o = 0.0f;
        z0Var.f50801p = 0.0f;
        z0Var.f50802q = 1.0f;
        MessagesController messagesController = MessagesController.getInstance(i9);
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
        this.f50480e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 0) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f5505f == 0) {
            f fVar = (f) q1Var.f5501a;
            int i10 = i9 - this.f50480e;
            ArrayList arrayList = this.f50481f;
            fVar.a((e) arrayList.get(i10));
            LimitPreviewView limitPreviewView = fVar.f50500c;
            limitPreviewView.B = ((e) arrayList.get(i10)).f50491e;
            limitPreviewView.f26451c = this.f50482n;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        t3 t3Var;
        Context context = viewGroup.getContext();
        b6 b6Var = this.f50479c;
        if (i9 != 1) {
            if (i9 != 2) {
                ?? fVar = new f(context, b6Var);
                fVar.f50500c.setParentViewForGradien(this.f50483r);
                fVar.f50500c.setStaticGradinet(this.h);
                t3Var = fVar;
            } else {
                t3Var = new t3(context, 16);
            }
        } else if (this.f50484s) {
            ?? b81Var = new b81(context, 11);
            LinearLayout f10 = ll.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(a1.c(context.getDrawable(R.drawable.other_2x_large), a1.d().f50456a));
            f10.addView(imageView, e6.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(f6.v0(f6.G6, b6Var));
            textView.setTypeface(AndroidUtilities.bold());
            f10.addView(textView, e6.e(-2, -2, 16));
            b81Var.addView(f10, e6.e(-2, -2, 17));
            t3Var = b81Var;
        } else {
            t3Var = new t3(context, 64);
        }
        return j3.r0.s(t3Var, t3Var, -1, -2);
    }
}
