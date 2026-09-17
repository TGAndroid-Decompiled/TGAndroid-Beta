package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f42657a;
    public final long f42658b;
    public final List f42659c;

    public d(long j3, long j10, List list) {
        this.f42657a = j3;
        this.f42658b = j10;
        this.f42659c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f42657a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.r(sb2, this.f42658b, " }");
    }
}
