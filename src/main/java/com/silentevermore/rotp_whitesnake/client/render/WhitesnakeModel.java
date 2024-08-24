package com.silentevermore.rotp_whitesnake.client.render;

import com.silentevermore.rotp_whitesnake.entity.WhitesnakeEntity;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.model.stand.bb.BlockbenchStandModelHelper;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPoseTransitionMultiple;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;

import javax.annotation.Nullable;

public class WhitesnakeModel extends HumanoidStandModel<WhitesnakeEntity>{
	//constants
	public static final StandPose REMOVE_DISC=new StandPose("WHITESNAKE_REMOVE_STAND_DISC");
	public static final StandPose THROW_DISC=new StandPose("WHITESNAKE_THROW_DISC");
	//builder
	public WhitesnakeModel(){
		super();
		BlockbenchStandModelHelper.fillFromBlockbenchExport(new WhitesnakeBlockbench(),this);
	}
	//methods
	@Override
	public void prepareMobModel(@Nullable WhitesnakeEntity entity, float walkAnimPos, float walkAnimSpeed, float partialTick) {
		super.prepareMobModel(entity, walkAnimPos, walkAnimSpeed, partialTick);
	}
	@Override
	protected RotationAngle[][] initSummonPoseRotations(){
		return new RotationAngle[][] {
				new RotationAngle[] {
						RotationAngle.fromDegrees(head, 10, -5, -5),
						RotationAngle.fromDegrees(body, 42.5, 0, 0),
						RotationAngle.fromDegrees(upperPart, 0, 0, 0),
						RotationAngle.fromDegrees(leftArm, -44.03249, 15.43388, -17.87164),
						RotationAngle.fromDegrees(leftForeArm, -10, 0, 0),
						RotationAngle.fromDegrees(rightArm, -40.45668, -40.95475, 50.18841),
						RotationAngle.fromDegrees(rightForeArm, -61.02177, 21.76063, -52.99488),
						RotationAngle.fromDegrees(leftLeg, -53.6138, -17.43362, 3.43655),
						RotationAngle.fromDegrees(leftLowerLeg, 32.5, 0, 0),
						RotationAngle.fromDegrees(rightLeg, -96.88938, -4.76887, 4.79739),
						RotationAngle.fromDegrees(rightLowerLeg, 75, 0, 0)
				}
		};
	}
	@Override
	protected void initActionPoses() {
		actionAnim.put(StandPose.RANGED_ATTACK, new PosedActionAnimation.Builder<WhitesnakeEntity>()
				.addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPose<>(new RotationAngle[] {
						new RotationAngle(body, 0.0F, -0.48F, 0.0F),
						new RotationAngle(leftArm, 0.0F, 0.0F, 0.0F),
						new RotationAngle(leftForeArm, 0.0F, 0.0F, 0.0F),
						new RotationAngle(rightArm, -1.0908F, 0.0F, 1.5708F),
						new RotationAngle(rightForeArm, 0.0F, 0.0F, 0.0F)
				}))
				.build(idlePose));
        // TODO: disc eject
        ModelPose<WhitesnakeEntity> disc_eject1 = new ModelPose<>(new RotationAngle[] {
                RotationAngle.fromDegrees(body, 0, 0, 0),
                RotationAngle.fromDegrees(leftArm, 0, 0, -5),
                RotationAngle.fromDegrees(rightArm, -12.5, -10, 20),
                RotationAngle.fromDegrees(rightForeArm, 0, 0, -42.5),
                RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
                RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
        });
		ModelPose<WhitesnakeEntity> disc_eject2 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 2.5, 25, 0),
				RotationAngle.fromDegrees(leftArm, -74.5276, -18.9354, -48.7151),
				RotationAngle.fromDegrees(leftForeArm, -42.5, 0, 0),
				RotationAngle.fromDegrees(rightArm, -14.3397, -14.6599, 25.0651),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -47.5),
				RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
				RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
		});
		ModelPose<WhitesnakeEntity> disc_eject3 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 2.5, 30, 0),
				RotationAngle.fromDegrees(leftArm, -81.5093, -16.007, -58.7417),
				RotationAngle.fromDegrees(leftForeArm, -57.5, 0, 0),
				RotationAngle.fromDegrees(rightArm, -14.3397, -14.6599, 25.0651),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -47.5),
				RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
				RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
		});
		ModelPose<WhitesnakeEntity> disc_eject4 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 2.5, 30, 0),
				RotationAngle.fromDegrees(leftArm, -81.5093, -16.007, -58.7417),
				RotationAngle.fromDegrees(leftForeArm, -57.5, 0, 0),
				RotationAngle.fromDegrees(rightArm, -22.5308, -22.2269, 33.7341),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -52.5),
				RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
				RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
		});
		ModelPose<WhitesnakeEntity> disc_eject5 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 0, 32.5, 0),
				RotationAngle.fromDegrees(leftArm, -96.5093, -16.007, -58.7417),
				RotationAngle.fromDegrees(leftForeArm, -57.5, 0, 0),
				RotationAngle.fromDegrees(rightArm, -22.5308, -22.2269, 33.7341),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -52.5),
				RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
				RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
		});
		ModelPose<WhitesnakeEntity> disc_eject6 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 25, -35, 0),
				RotationAngle.fromDegrees(leftArm, -4.3118, 23.8478, -91.254),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -22.5308, -22.2269, 33.7341),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -52.5),
				RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
				RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
		});
		ModelPose<WhitesnakeEntity> disc_eject7 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 25, -35, 0),
				RotationAngle.fromDegrees(leftArm, -14.3118, 23.8478, -91.254),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -11.5912, -11.0441, 15.0265),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -37.5),
				RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
				RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
		});
		ModelPose<WhitesnakeEntity> disc_eject8 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 25, -35, 0),
				RotationAngle.fromDegrees(leftArm, -14.3118, 23.8478, -91.254),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -12.5, -10, 20),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -42.5),
				RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
				RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
		});
		ModelPose<WhitesnakeEntity> disc_eject9 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 0, -25, 0),
				RotationAngle.fromDegrees(leftArm, 0, 0, 0),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -12.5, -10, 20),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -42.5),
				RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
				RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
		});
		ModelPose<WhitesnakeEntity> disc_eject10 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 0, 0, 0),
				RotationAngle.fromDegrees(leftArm, 0, 0, 0),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -12.5, -10, 20),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -42.5),
				RotationAngle.fromDegrees(leftLeg, -0.6301, -10.0563, -4.618),
				RotationAngle.fromDegrees(rightLeg, -0.8416, 5.0198, 0.1512)
		});
		ModelPose<WhitesnakeEntity> disc_eject11 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 0, 0, 0),
				RotationAngle.fromDegrees(leftArm, 0, 0, -5),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -12.5, -10, 20),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -42.5),
				RotationAngle.fromDegrees(leftLeg, 0.4407, -9.9904, -2.5385),
				RotationAngle.fromDegrees(rightLeg, 0.2187, 4.9952, 2.5095)
		});
        // TODO: disc throw
		ModelPose<WhitesnakeEntity> disc_throw1 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head,0, 0, 0),
				RotationAngle.fromDegrees(body,0, 22.5, 0),
				RotationAngle.fromDegrees(leftArm, 12.0826, -3.136, -22.1749),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -55.1696, 1.2926, 40.0545),
				RotationAngle.fromDegrees(rightForeArm, -47.5, 0, 0),
				RotationAngle.fromDegrees(leftLeg, 3.6457, -14.681, -3.8271),
				RotationAngle.fromDegrees(leftLegJoint, 0, 0, 0),
				RotationAngle.fromDegrees(leftLowerLeg, 0, 0, 0),
				RotationAngle.fromDegrees(rightLeg, 10.5594, 18.6119, 10.5594),
				RotationAngle.fromDegrees(rightLowerLeg, 0, 0, 0)
		});
		ModelPose<WhitesnakeEntity> disc_throw2 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head,-5, 5, 0),
				RotationAngle.fromDegrees(body,0, 32.5, 0),
				RotationAngle.fromDegrees(leftArm, 12.4769, 0.0718, -36.8351),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -202.164, 73.5915, -72.6038),
				RotationAngle.fromDegrees(rightForeArm, -77.5, 0, 0),
				RotationAngle.fromDegrees(leftLeg, 16.1457, -14.681, -3.8271),
				RotationAngle.fromDegrees(leftLegJoint, 0, 0, 0),
				RotationAngle.fromDegrees(leftLowerLeg, 0, 0, 0),
				RotationAngle.fromDegrees(rightLeg, -6.9406, 18.6119, 10.5594),
				RotationAngle.fromDegrees(rightLowerLeg, 0, 0, 0)
		});
		ModelPose<WhitesnakeEntity> disc_throw3 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head,2.5, -10, 0),
				RotationAngle.fromDegrees(body,30, -32.5, 0),
				RotationAngle.fromDegrees(leftArm, 30, -32.5, 0),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -54.6869, -8.9513, 32.8655),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(leftLeg, 26.1457, -14.681, -3.8271),
				RotationAngle.fromDegrees(leftLegJoint, 0, 0, 0),
				RotationAngle.fromDegrees(leftLowerLeg, 0, 0, 0),
				RotationAngle.fromDegrees(rightLeg, 38.0594, 18.6119, 10.5594),
				RotationAngle.fromDegrees(rightLowerLeg, 0, 0, 0)
		});
		ModelPose<WhitesnakeEntity> disc_throw4 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head,0, -5, 0),
				RotationAngle.fromDegrees(body,17.5, -32.5, 0),
				RotationAngle.fromDegrees(leftArm, 17.5, -32.5, 0),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(rightArm, -55.1696, 1.2926, 40.0545),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, 0),
				RotationAngle.fromDegrees(leftLeg, 3.6457, -14.681, -3.8271),
				RotationAngle.fromDegrees(leftLegJoint, 0, 0, 0),
				RotationAngle.fromDegrees(leftLowerLeg, 0, 0, 0),
				RotationAngle.fromDegrees(rightLeg, 10.5594, 18.6119, 10.5594),
				RotationAngle.fromDegrees(rightLowerLeg, 0, 0, 0)
		});
		actionAnim.put(REMOVE_DISC, new PosedActionAnimation.Builder<WhitesnakeEntity>()
				.addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPoseTransitionMultiple.Builder<>(idlePose)
						.addPose(0, disc_eject1)
						.addPose(0.25f, disc_eject2)
						.addPose(0.38f, disc_eject3)
						.addPose(0.5f, disc_eject4)
						.addPose(0.75f, disc_eject5)
						.build(disc_eject5))
				.addPose(StandEntityAction.Phase.PERFORM, new ModelPoseTransitionMultiple.Builder<>(disc_eject5)
						.addPose(0.75f, disc_eject5)
						.addPose(0.88f, disc_eject6)
						.addPose(1f, disc_eject7)
						.addPose(1.13f, disc_eject8)
						.addPose(1.25f, disc_eject9)
						.addPose(1.38f, disc_eject10)
						.addPose(1.5f, disc_eject11)
						.build(disc_eject11))
				.addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(disc_eject11)
						.addPose(1.5f, disc_eject11)
						.addPose(1.75f, idlePose)
						.build(idlePose))
				.build(idlePose));
		actionAnim.put(THROW_DISC, new PosedActionAnimation.Builder<WhitesnakeEntity>()
				.addPose(StandEntityAction.Phase.PERFORM, new ModelPoseTransitionMultiple.Builder<>(idlePose)
						.addPose(0, disc_throw1)
						.addPose(0.08f, disc_throw2)
						.addPose(0.25f, disc_throw3)
						.addPose(0.33F, disc_throw4)
						.build(disc_throw4))
				.addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(disc_throw4)
                        .addPose(0.33F, disc_throw4)
						.build(idlePose))
				.build(idlePose));

		super.initActionPoses();
	}
	@Override
	protected ModelPose<WhitesnakeEntity> initIdlePose() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head, 7.07745, 17.67052, -0.24255),
				RotationAngle.fromDegrees(body, -3.89307, 12.45167, 5.12076),
				RotationAngle.fromDegrees(upperPart, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(leftArm, -47.5983, 68.38059, -33.58298),
				RotationAngle.fromDegrees(leftArmJoint, -28.26919, -3.12516, 10.12488),
				RotationAngle.fromDegrees(leftForeArm, -51.40133, -1.40325, 17.91077),
				RotationAngle.fromDegrees(rightArm, -40.65653, -55.87912, 39.57735),
				RotationAngle.fromDegrees(rightArmJoint, -35, 0, 0),
				RotationAngle.fromDegrees(rightForeArm, -59.11573, -8.14866, -32.88084),
				RotationAngle.fromDegrees(leftLeg, 5.72511, -29.4987, -19.00839),
				RotationAngle.fromDegrees(leftLowerLeg, 15, 0, 0),
				RotationAngle.fromDegrees(rightLeg, -0.44067, -9.99038, 2.53852),
				RotationAngle.fromDegrees(rightLowerLeg, 15, 0, 0)
		});
	}
	@Override
	protected ModelPose<WhitesnakeEntity> initIdlePose2Loop() {
		return new ModelPose<>(new RotationAngle[]{
				RotationAngle.fromDegrees(leftArm, -42.5983, 68.38059, -33.58298),
				RotationAngle.fromDegrees(leftForeArm, -61.40133, -1.40325, 17.91077),
				RotationAngle.fromDegrees(rightArm, -35.65653, -55.87912, 39.57735),
				RotationAngle.fromDegrees(rightForeArm, -66.11573, -8.14866, -32.88084),
		});
	}
}  
