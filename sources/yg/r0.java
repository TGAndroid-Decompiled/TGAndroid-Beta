package yg;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;
import xh.k1;
public abstract class r0 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, r rVar, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j3 = document.f17201id;
        y5 e = e(document, Long.valueOf(j3), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j3), e);
        arrayList.add(Long.valueOf(j3));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (rVar != null) {
            rVar.x(Long.valueOf(j3), false);
        }
    }

    public static void b(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews != null) {
            int i10 = 0;
            boolean z10 = false;
            while (i10 < storyViews.reactions.size()) {
                TLRPC.ReactionCount reactionCount = storyViews.reactions.get(i10);
                if (reaction != null && c(reactionCount.reaction, reaction)) {
                    int i11 = reactionCount.count - 1;
                    reactionCount.count = i11;
                    if (i11 <= 0) {
                        storyViews.reactions.remove(i10);
                        i10--;
                        i10++;
                    }
                }
                if (reaction2 != null && c(reactionCount.reaction, reaction2)) {
                    reactionCount.count++;
                    z10 = true;
                }
                i10++;
            }
            if (!z10) {
                TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                tL_reactionCount.count = 1;
                tL_reactionCount.reaction = reaction2;
                storyViews.reactions.add(tL_reactionCount);
            }
        }
    }

    public static boolean c(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
            return true;
        }
        if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) {
            return true;
        }
        return false;
    }

    public static boolean d(TLRPC.Reaction reaction, p0 p0Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && p0Var.f47102g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, p0Var.f47101f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j3 = p0Var.f47102g;
            if (j3 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static y5 e(TLRPC.Document document, Long l4, Paint.FontMetricsInt fontMetricsInt) {
        y5 y5Var;
        if (document != null) {
            y5Var = new y5(document.f17201id, 1.0f, fontMetricsInt);
            y5Var.document = document;
        } else {
            y5Var = new y5(l4.longValue(), 1.0f, fontMetricsInt);
        }
        y5Var.cacheType = p5.g();
        return y5Var;
    }

    public static void f(long j3, int i10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        p2 R = LaunchActivity.R();
        if (R != null && tL_premium_boostsStatus != null) {
            qg.k0 k0Var = new qg.k0(21, UserConfig.selectedAccount, R.getContext(), R, R.getResourceProvider());
            k0Var.R0 = i10;
            k0Var.F1(tL_premium_boostsStatus, true);
            k0Var.H1(j3);
            k0Var.Q0 = new k1(R, j3);
            k0Var.show();
        }
    }
}
