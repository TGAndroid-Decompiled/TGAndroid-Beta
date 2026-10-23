package sg;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.nk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.im0;
import org.telegram.ui.j41;
import w7.z5;
public final class d extends im0 {
    public final d6 f46239c;
    public final int d;
    public final int e;
    public final ArrayList f46240f;
    public final a1 h;
    public int f46241n;
    public c f46242r;
    public final boolean f46243s;

    public d(int i10, d6 d6Var) {
        ArrayList arrayList = new ArrayList();
        this.f46240f = arrayList;
        this.f46243s = true;
        this.f46239c = d6Var;
        a1 a1Var = new a1(h6.Lj, h6.Mj, h6.Nj, h6.Oj, d6Var);
        this.h = a1Var;
        a1Var.f46203o = 0.0f;
        a1Var.f46204p = 0.0f;
        a1Var.f46205q = 1.0f;
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
    public final boolean D(s4.b1 b1Var) {
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
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f45924f == 0) {
            f fVar = (f) b1Var.f45921a;
            int i11 = i10 - this.e;
            ArrayList arrayList = this.f46240f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f46253c;
            limitPreviewView.F = ((e) arrayList.get(i11)).e;
            limitPreviewView.f24288c = this.f46241n;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        s3 s3Var;
        Context context = viewGroup.getContext();
        d6 d6Var = this.f46239c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, d6Var);
                fVar.f46253c.setParentViewForGradien(this.f46242r);
                fVar.f46253c.setStaticGradinet(this.h);
                s3Var = fVar;
            } else {
                s3Var = new s3(context, 16);
            }
        } else if (this.f46243s) {
            ?? j41Var = new j41(context, 10);
            LinearLayout e = nk.e(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(b1.c(context.getDrawable(R.drawable.other_2x_large), b1.d().f46222a));
            e.addView(imageView, z5.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(h6.w0(h6.G6, d6Var));
            textView.setTypeface(AndroidUtilities.bold());
            e.addView(textView, z5.e(-2, -2, 16));
            j41Var.addView(e, z5.e(-2, -2, 17));
            s3Var = j41Var;
        } else {
            s3Var = new s3(context, 64);
        }
        return k3.l(s3Var, s3Var, -1, -2);
    }
}
