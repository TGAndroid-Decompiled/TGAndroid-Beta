package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class ur implements ActionMode.Callback {
    public final vr f43303a;

    public ur(vr vrVar) {
        this.f43303a = vrVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        sr srVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i9;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        vr vrVar = this.f43303a;
        if (vrVar.getParent() instanceof sr) {
            srVar = (sr) vrVar.getParent();
        } else {
            srVar = null;
        }
        if (srVar != null && (clipboardManager = (ClipboardManager) f0.e.f(vrVar.getContext(), ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i9 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i9 = -1;
            }
            if (i9 > 0) {
                srVar.c(charSequence, true);
            }
        }
        vrVar.hideActionMode();
        return true;
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, 16908322, 0, 17039371);
        return true;
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
