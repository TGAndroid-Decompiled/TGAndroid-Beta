package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ve1 extends org.telegram.ui.Components.mm0 {
    public final ye1 f44328c;

    public ve1(ye1 ye1Var) {
        this.f44328c = ye1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ye1 ye1Var = this.f44328c;
        if (ye1Var.f45995n0) {
            return 0;
        }
        return ye1Var.m0;
    }

    @Override
    public final int j(int i10) {
        ye1 ye1Var = this.f44328c;
        if (i10 != ye1Var.f45992j0 && i10 != ye1Var.f45989g0) {
            if (i10 >= ye1Var.f45990h0 && i10 < ye1Var.f45991i0) {
                return 2;
            }
            if (i10 >= ye1Var.f45993k0 && i10 < ye1Var.f45994l0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        View view = e1Var.f47773a;
        ye1 ye1Var = this.f44328c;
        cf1 cf1Var = ye1Var.f46003v0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == ye1Var.f45989g0) {
                z3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == ye1Var.f45992j0) {
                z3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            uaVar.setTopic((TLRPC.TL_forumTopic) ye1Var.f45987e0.get(i10 - ye1Var.f45990h0));
            if (i10 != ye1Var.f45991i0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            uaVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) ye1Var.f45988f0.get(i10 - ye1Var.f45993k0);
            ze1 ze1Var = (ze1) view;
            if (i10 != ye1Var.f45994l0 - 1) {
                z11 = true;
            }
            ze1Var.f46243a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = cf1Var.f38326s.findTopic(cf1Var.f38288a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            ze1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
            ze1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        cf1 cf1Var = this.f44328c.f46003v0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? ze1Var = new ze1(cf1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.r2) cf1Var).inPreviewMode;
                    ze1Var.f24681k0 = z10;
                    frameLayout = ze1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ua(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(frameLayout);
    }
}
