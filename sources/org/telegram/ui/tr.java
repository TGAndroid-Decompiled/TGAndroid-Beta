package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class tr implements ActionMode.Callback {
    public final ur f43090a;

    public tr(ur urVar) {
        this.f43090a = urVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        sr srVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i10;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        ur urVar = this.f43090a;
        if (urVar.getParent() instanceof sr) {
            srVar = (sr) urVar.getParent();
        } else {
            srVar = null;
        }
        if (srVar != null && (clipboardManager = (ClipboardManager) f0.e.f(urVar.getContext(), ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i10 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 > 0) {
                srVar.c(charSequence, true);
            }
        }
        urVar.hideActionMode();
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
