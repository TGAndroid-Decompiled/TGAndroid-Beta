package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class yq implements ActionMode.Callback {
    public final zq f52381a;

    public yq(zq zqVar) {
        this.f52381a = zqVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        xq xqVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i3;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        zq zqVar = this.f52381a;
        if (zqVar.getParent() instanceof xq) {
            xqVar = (xq) zqVar.getParent();
        } else {
            xqVar = null;
        }
        if (xqVar != null && (clipboardManager = (ClipboardManager) zqVar.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i3 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i3 = -1;
            }
            if (i3 > 0) {
                xqVar.c(charSequence, true);
            }
        }
        zqVar.m();
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
