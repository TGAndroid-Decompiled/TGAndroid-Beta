package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.m1;
import java.util.ArrayList;
import oh.d6;
import oh.l6;
import oh.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.tl0;
public class k extends dl0 {
    public final Context f44385c;
    public l6 f44386e;
    public k f44387f;
    public q7 h;
    public boolean f44389r;
    public final l f44390s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f44388n = new ArrayList();

    public k(l lVar, Context context) {
        this.f44390s = lVar;
        this.f44385c = context;
        M();
    }

    @Override
    public final boolean D(m1 m1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        l6 l6Var = this.f44386e;
        if (l6Var == null || i10 < 0 || i10 >= l6Var.f17402i.size() || (messageObject = (MessageObject) this.f44386e.f17402i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        int i10;
        int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
        k kVar = this.f44387f;
        l lVar = this.f44390s;
        if (this == kVar) {
            i10 = lVar.f44394e;
        } else {
            i10 = lVar.d;
        }
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = tl0Var.getMeasuredHeight() - tl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i10;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    public final boolean L(int i10) {
        or0 or0Var = this.f44390s.T;
        l6 l6Var = this.f44386e;
        if (l6Var != null) {
            if (l6Var instanceof d6) {
                TLRPC.User user = MessagesController.getInstance(or0Var.f44407b).getUser(Long.valueOf(or0Var.d));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < l6Var.f17402i.size()) {
                return this.f44386e.m(((MessageObject) this.f44386e.f17402i.get(i10)).getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f44386e != null) {
            l lVar = this.f44390s;
            if ((!lVar.F || (lVar.E && h() > 1)) && h() > 0) {
                boolean z4 = false;
                if (h() < 5) {
                    int max = Math.max(1, h());
                    lVar.d = max;
                    if (max == 1) {
                        z4 = true;
                    }
                    lVar.E = z4;
                } else if (lVar.E || lVar.d == 1) {
                    lVar.E = false;
                    lVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
                }
                lVar.h.y1(lVar.d);
                lVar.F = true;
            }
        }
    }

    @Override
    public final int h() {
        if (this.f44386e == null) {
            return 0;
        }
        return this.f44386e.g() + this.d.size();
    }

    @Override
    public final int j(int i10) {
        return 19;
    }

    @Override
    public final int k() {
        return h();
    }

    @Override
    public void l() {
        l6 l6Var = this.f44386e;
        boolean z4 = l6Var instanceof d6;
        l lVar = this.f44390s;
        if (z4) {
            d6 d6Var = (d6) l6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.f44386e.f17398c).getStoriesController().E(lVar.T.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    s6 s6Var = (s6) E.get(i10);
                    qh.s6 s6Var2 = s6Var.f17737c;
                    if (s6Var2 != null && !s6Var2.f46057g && TextUtils.equals(s6Var2.K0, d6Var.E)) {
                        arrayList.add(s6Var);
                    }
                }
            }
        }
        super.l();
        k kVar = this.f44387f;
        if (kVar != null) {
            kVar.l();
        }
        if (this != lVar.f44399w) {
            M();
            lVar.c();
        }
    }

    @Override
    public final void v(m1 m1Var, int i10) {
        int i11;
        boolean z4;
        int i12;
        int i13;
        if (this.f44386e != null) {
            View view = m1Var.f5875a;
            if (!(view instanceof r7)) {
                return;
            }
            r7 r7Var = (r7) view;
            r7Var.f23558a0 = true;
            l lVar = this.f44390s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                s6 s6Var = (s6) arrayList.get(i10);
                r7Var.f23562c0 = false;
                if (s6Var.H == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = s6Var.f17735a;
                    int i14 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f21080id = i14;
                    tL_storyItem.attachPath = s6Var.f17739f;
                    MessageObject messageObject = new MessageObject(this.f44386e.f17398c, tL_storyItem);
                    s6Var.H = messageObject;
                    messageObject.uploadingStory = s6Var;
                }
                MessageObject messageObject2 = s6Var.H;
                if (this == this.f44387f) {
                    i13 = lVar.f44394e;
                } else {
                    i13 = lVar.d;
                }
                r7Var.k(messageObject2, i13, false);
                r7Var.f23558a0 = true;
                r7Var.setReorder(false);
                r7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.f44386e.f17402i.size()) {
                MessageObject messageObject3 = (MessageObject) this.f44386e.f17402i.get(size);
                if (messageObject3 != null && this.f44386e.m(messageObject3.getId())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                r7Var.f23562c0 = z4;
                r7Var.setReorder(true);
                if (this == this.f44387f) {
                    i12 = lVar.f44394e;
                } else {
                    i12 = lVar.d;
                }
                r7Var.k(messageObject3, i12, false);
                or0 or0Var = lVar.T;
                if (or0Var.D.f34021z1 && messageObject3 != null) {
                    r7Var.i(or0Var.c(messageObject3), true);
                    return;
                } else {
                    r7Var.i(false, false);
                    return;
                }
            }
            r7Var.f23562c0 = false;
            if (this == this.f44387f) {
                i11 = lVar.f44394e;
            } else {
                i11 = lVar.d;
            }
            r7Var.k(null, i11, false);
            r7Var.f23558a0 = true;
        }
    }

    @Override
    public final m1 x(ViewGroup viewGroup, int i10) {
        or0 or0Var = this.f44390s.T;
        if (this.h == null) {
            this.h = new q7(viewGroup.getContext(), or0Var.f44408c);
        }
        r7 r7Var = new r7(this.f44385c, this.h, or0Var.f44407b);
        r7Var.f23583t0 = true;
        r7Var.setGradientView(null);
        r7Var.f23558a0 = true;
        return new m1(r7Var);
    }

    @Override
    public final void I() {
    }
}
