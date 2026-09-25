package zg;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import yh.l1;
public abstract class q0 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, p pVar, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j3 = document.f18342id;
        z5 e = e(document, Long.valueOf(j3), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j3), e);
        arrayList.add(Long.valueOf(j3));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (pVar != null) {
            pVar.x(Long.valueOf(j3), false);
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

    public static boolean d(TLRPC.Reaction reaction, o0 o0Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && o0Var.f49398g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, o0Var.f49397f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j3 = o0Var.f49398g;
            if (j3 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static z5 e(TLRPC.Document document, Long l4, Paint.FontMetricsInt fontMetricsInt) {
        z5 z5Var;
        if (document != null) {
            z5Var = new z5(document.f18342id, 1.0f, fontMetricsInt);
            z5Var.document = document;
        } else {
            z5Var = new z5(l4.longValue(), 1.0f, fontMetricsInt);
        }
        z5Var.cacheType = q5.g();
        return z5Var;
    }

    public static void f(long j3, int i10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        m2 R = LaunchActivity.R();
        if (R != null && tL_premium_boostsStatus != null) {
            rg.j0 j0Var = new rg.j0(21, UserConfig.selectedAccount, R.getContext(), R, R.getResourceProvider());
            j0Var.R0 = i10;
            j0Var.F1(tL_premium_boostsStatus, true);
            j0Var.H1(j3);
            j0Var.Q0 = new l1(R, j3);
            j0Var.show();
        }
    }
}
