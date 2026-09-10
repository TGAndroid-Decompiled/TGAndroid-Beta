package zh;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wz;
import org.telegram.ui.w01;
public final class s5 implements q7 {
    public final vl0 f48865a;
    public final w01 f48866b;
    public final int[] f48867c;
    public final boolean d;
    public r5 e;
    public boolean f48868f;
    public boolean h;
    public boolean f48869n;
    public boolean f48870r;
    public int f48871s;

    public s5(vl0 vl0Var, boolean z10) {
        this.f48867c = new int[2];
        this.f48865a = vl0Var;
        this.d = z10;
        this.f48866b = null;
    }

    public static s5 a(vl0 vl0Var) {
        return new s5(vl0Var, false);
    }

    @Override
    public final void H0(long j3, int i10, j2 j2Var) {
        ArrayList arrayList;
        vl0 vl0Var = this.f48865a;
        if (vl0Var != null && (vl0Var.getParent() instanceof l)) {
            l lVar = (l) vl0Var.getParent();
            if (lVar.k(j3)) {
                lVar.f48599b0.add(j2Var);
                return;
            } else {
                j2Var.run();
                return;
            }
        }
        int i11 = 0;
        if (vl0Var != null && (vl0Var.getParent() instanceof z3)) {
            z3 z3Var = (z3) vl0Var.getParent();
            wz wzVar = z3Var.f49145x;
            v3 v3Var = z3Var.f49144w;
            if (v3Var != null && (arrayList = v3Var.f48987c) != null && wzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        r3 r3Var = (r3) arrayList.get(i11);
                        if (r3Var != null) {
                            TL_stories.StoryReaction storyReaction = r3Var.f48829c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f17435id == i10) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    int L0 = wzVar.L0();
                    int N0 = wzVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        wzVar.h1(i11, AndroidUtilities.dp(60.0f));
                        vl0Var.post(j2Var);
                        return;
                    }
                }
            }
            j2Var.run();
            return;
        }
        if (this.d) {
            i5 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f48499a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        j2Var.run();
    }

    @Override
    public final void b(boolean z10) {
        r5 r5Var = this.e;
        if (r5Var != null) {
            r5Var.b(z10);
        }
    }

    public final void c(r7 r7Var) {
        View view = r7Var.f48845g;
        if (view == null) {
            return;
        }
        if (view instanceof q5) {
            int[] iArr = this.f48867c;
            ((q5) view).a(iArr);
            r7Var.h = iArr[0];
            r7Var.f48846i = iArr[1] - this.f48871s;
        } else if (view instanceof ha) {
            r7Var.h = ((ha) view).X2;
            r7Var.f48846i = (view.getMeasuredHeight() - r7Var.f48845g.getPaddingBottom()) - this.f48871s;
        } else {
            r7Var.h = view.getPaddingTop();
            r7Var.f48846i = (r7Var.f48845g.getMeasuredHeight() - r7Var.f48845g.getPaddingBottom()) - this.f48871s;
        }
    }

    @Override
    public final boolean y0(long j3, int i10, int i11, int i12, r7 r7Var) {
        l lVar;
        ViewGroup viewGroup;
        boolean z10;
        o7 o7Var = null;
        r7Var.f48841a = null;
        r7Var.f48842b = null;
        r7Var.f48843c = null;
        r7Var.e = null;
        vl0 vl0Var = this.f48865a;
        if (vl0Var != null && (vl0Var.getParent() instanceof l)) {
            lVar = (l) vl0Var.getParent();
        } else {
            lVar = null;
        }
        if (lVar != null && !lVar.g()) {
            viewGroup = lVar.f48617r;
        } else {
            viewGroup = vl0Var;
        }
        ViewGroup viewGroup2 = this.f48866b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof k) {
                    k kVar = (k) childAt;
                    if (kVar.E == j3) {
                        r7Var.f48841a = childAt;
                        r7Var.f48842b = kVar.f48570r;
                        r7Var.f48850m = kVar.O;
                        r7Var.d = kVar.R;
                        l lVar2 = (l) kVar.getParent().getParent();
                        r7Var.f48845g = lVar2;
                        r7Var.f48846i = 0.0f;
                        r7Var.h = 0.0f;
                        r7Var.f48848k = 1.0f;
                        if (kVar.G && lVar2.g()) {
                            r7Var.f48844f = new th.e(new Path(), 24);
                            return true;
                        }
                        r7Var.f48844f = o7Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.f19852u0;
                    long dialogId = r2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j3 && !z11) || (z11 && r2Var.O())) {
                        r7Var.f48841a = childAt;
                        r7Var.f48850m = j2Var;
                        r7Var.f48842b = imageReceiver;
                        r7Var.f48845g = (View) r2Var.getParent();
                        if (z11) {
                            r7Var.f48849l = imageReceiver;
                            boolean z12 = j2Var.f49066w;
                        }
                        r7Var.f48848k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        r7Var.f48841a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            r7Var.f48843c = t1Var.F9;
                        } else {
                            r7Var.f48843c = t1Var.getPhotoImage();
                        }
                        r7Var.f48845g = (View) t1Var.getParent();
                        r7Var.f48848k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        r7Var.f48841a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            r7Var.f48842b = w0Var.getPhotoImage();
                        } else {
                            r7Var.f48843c = w0Var.getPhotoImage();
                        }
                        r7Var.f48845g = (View) w0Var.getParent();
                        r7Var.f48848k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.u7) && vl0Var != null) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    MessageObject messageObject = u7Var.getMessageObject();
                    if ((u7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        cl0 fastScroll = vl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        r7Var.f48841a = childAt;
                        r7Var.f48843c = u7Var.f20497c;
                        r7Var.e = new f21(u7Var, fastScroll, iArr, 11);
                        r7Var.f48845g = (View) u7Var.getParent();
                        r7Var.f48848k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof bb) {
                    bb bbVar = (bb) childAt;
                    if (bbVar.getDialogId() == j3) {
                        gg.i1 i1Var = bbVar.f18940a;
                        r7Var.f48841a = i1Var;
                        r7Var.f48850m = bbVar.T;
                        r7Var.f48842b = i1Var.getImageReceiver();
                        r7Var.f48845g = (View) bbVar.getParent();
                        r7Var.f48848k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.p6) {
                    org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) childAt;
                    w9 w9Var = p6Var.h;
                    if (p6Var.f19684x != j3) {
                        continue;
                    } else {
                        if (w9Var != null && w9Var.getImageReceiver() != null && w9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (p6Var.f19680n == i11 && z10) {
                            r7Var.f48841a = w9Var;
                            r7Var.f48843c = w9Var.getImageReceiver();
                            r7Var.f48845g = (View) p6Var.getParent();
                            float alphaInternal = p6Var.getAlphaInternal() * p6Var.getAlpha();
                            r7Var.f48848k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                r7Var.f48847j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, p6Var.getResourcesProvider()));
                            }
                            c(r7Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.o6 o6Var = p6Var.f19678c;
                            r7Var.f48841a = o6Var;
                            r7Var.f48850m = p6Var.f19685y;
                            r7Var.f48842b = o6Var.getImageReceiver();
                            r7Var.f48845g = (View) p6Var.getParent();
                            float alphaInternal2 = p6Var.getAlphaInternal() * p6Var.getAlpha();
                            r7Var.f48848k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                r7Var.f48847j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, p6Var.getResourcesProvider()));
                            }
                            c(r7Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j6) {
                    org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                    if (j6Var.getDialogId() == j3) {
                        r7Var.f48841a = j6Var;
                        r7Var.f48850m = j6Var.f19380u0;
                        r7Var.f48842b = j6Var.f19375r;
                        r7Var.f48845g = (View) j6Var.getParent();
                        r7Var.f48848k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) childAt;
                    if (d8Var.getPostInfo().b() == i11) {
                        r7Var.f48841a = d8Var.getImageView();
                        r7Var.f48850m = d8Var.getStoryAvatarParams();
                        r7Var.f48843c = d8Var.getImageView().getImageReceiver();
                        r7Var.f48845g = (View) d8Var.getParent();
                        r7Var.f48848k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i10) {
                        r7Var.f48841a = b5Var.getAvatarImageView();
                        r7Var.f48850m = b5Var.getStoryAvatarParams();
                        r7Var.f48842b = b5Var.getAvatarImageView().getImageReceiver();
                        r7Var.f48845g = (View) b5Var.getParent();
                        r7Var.f48848k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                o7Var = null;
            }
        }
        return false;
    }

    public s5(w01 w01Var) {
        this.f48867c = new int[2];
        this.f48866b = w01Var;
        this.f48865a = null;
    }
}
