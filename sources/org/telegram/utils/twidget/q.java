package org.telegram.utils.twidget;

import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
public final class q implements y, x {
    public final int f55034a;
    public final Object f55035b;

    public q(Object obj, int i7) {
        this.f55034a = i7;
        this.f55035b = obj;
    }

    @Override
    public void a(byte[] bArr) {
        WidgetEngineBackend.i((WidgetEngineBackend) this.f55035b, bArr);
    }

    public InputStream b(String str) {
        switch (this.f55034a) {
            case 2:
                ZipFile zipFile = (ZipFile) this.f55035b;
                String str2 = WidgetEngineService.f54797b;
                ZipEntry entry = zipFile.getEntry("assets/WidgetSandbox/" + str);
                if (entry != null) {
                    return zipFile.getInputStream(entry);
                }
                throw new FileNotFoundException(str);
            default:
                String str3 = WidgetEngineService.f54797b;
                return ((AssetManager) this.f55035b).open("WidgetSandbox/" + str);
        }
    }

    @Override
    public void mo26run() {
        WidgetEngineBackend.m((y) this.f55035b);
    }
}
