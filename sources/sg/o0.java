package sg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f5;
public final class o0 {
    public boolean f48431a;
    public boolean f48432b;
    public long f48433c;
    public boolean d;
    public boolean e;
    public String f48434f;
    public long f48435g;
    public long h;

    public static o0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f48435g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f48434f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f48434f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static o0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f48434f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static o0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f48431a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f48434f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f48435g = j10;
                obj.h = j10;
            }
            return obj;
        }
    }

    public static o0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f48432b = true;
        long j10 = tL_availableEffect.f19824id;
        obj.f48433c = j10;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.e = z10;
        obj.f48435g = tL_availableEffect.effect_sticker_id;
        obj.h = j10;
        obj.d = tL_availableEffect.premium_required;
        obj.f48434f = tL_availableEffect.emoticon;
        return obj;
    }

    public final o0 a() {
        String V;
        long j10 = this.f48435g;
        if (j10 != 0 && (V = jj.V(f5.e(d20.f15147s0, j10), null, null)) != null) {
            return b(V);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            if (this.f48435g == o0Var.f48435g && Objects.equals(this.f48434f, o0Var.f48434f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f48434f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f48435g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f48431a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f48434f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f48434f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f48435g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f48434f, Long.valueOf(this.f48435g));
    }

    public final String toString() {
        TLRPC.Document e;
        if (!TextUtils.isEmpty(this.f48434f)) {
            return this.f48434f;
        }
        long j10 = this.f48435g;
        if (j10 != 0 && (e = f5.e(d20.f15147s0, j10)) != null) {
            return jj.V(e, null, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f48435g);
        sb2.append(", ");
        return a1.g.r(sb2, this.f48434f, "}");
    }
}
