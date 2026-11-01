package sg;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.o5;
import org.telegram.ui.LaunchActivity;
import rh.r1;
public abstract class q0 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, m mVar, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j10 = document.f19800id;
        o5 e = e(document, Long.valueOf(j10), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j10), e);
        arrayList.add(Long.valueOf(j10));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (mVar != null) {
            mVar.x(Long.valueOf(j10), false);
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
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && o0Var.f48446g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, o0Var.f48445f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = o0Var.f48446g;
            if (j10 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static o5 e(TLRPC.Document document, Long l4, Paint.FontMetricsInt fontMetricsInt) {
        o5 o5Var;
        if (document != null) {
            o5Var = new o5(document.f19800id, 1.0f, fontMetricsInt);
            o5Var.document = document;
        } else {
            o5Var = new o5(l4.longValue(), 1.0f, fontMetricsInt);
        }
        o5Var.cacheType = f5.f();
        return o5Var;
    }

    public static void f(long j10, int i10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        k2 Q = LaunchActivity.Q();
        if (Q != null && tL_premium_boostsStatus != null) {
            kg.q0 q0Var = new kg.q0(21, e20.f15506s0, Q.getContext(), Q, Q.getResourceProvider());
            q0Var.J2 = i10;
            q0Var.z1(tL_premium_boostsStatus, true);
            q0Var.B1(j10);
            q0Var.I2 = new r1(Q, j10);
            q0Var.show();
        }
    }
}
